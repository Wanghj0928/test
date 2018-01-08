package com.wanghj.test.service.impl;

import com.wanghj.test.dao.CityDao;
import com.wanghj.test.domain.City;
import com.wanghj.test.service.CityService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    Logger logger = LogManager.getLogger();

    @Autowired
    private CityDao cityDao;

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public City findCityByName(String cityName) {
        // 从缓存中获取城市信息
        String key = "city_" + cityName;
        ValueOperations<String, City> operations = redisTemplate.opsForValue();

        // 缓存存在
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            City city = operations.get(key);

            logger.info("CityServiceImpl.findCityById() : 从缓存中获取了城市 >> " + city.toString());
            return city;
        }

        // 从 DB 中获取城市信息
        City city = cityDao.findByName(cityName);

        // 插入缓存
        operations.set(key, city, 10, TimeUnit.SECONDS);
        logger.info("CityServiceImpl.findCityById() : 城市插入缓存 >> " + city.toString());
        return cityDao.findByName(cityName);
    }

}
