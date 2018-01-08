package com.wanghj.test.service;


import com.wanghj.test.domain.Menu;

/**
 * @author wanghj
 * @create 2018-01-08 11:36
 **/
public interface MenuService {
    Menu selectByPrimaryKey(Integer menuId);
}
