package com.wanghj.test.service.impl;

import com.wanghj.test.dao.MenuMapper;
import com.wanghj.test.domain.Menu;
import com.wanghj.test.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanghj
 * @create 2018-01-08 11:37
 **/
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public Menu selectByPrimaryKey(Integer menuId) {
        return menuMapper.selectByPrimaryKey(menuId);
    }
}
