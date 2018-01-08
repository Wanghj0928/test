package com.wanghj.test.controller;

import com.wanghj.test.domain.Menu;
import com.wanghj.test.service.MenuService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghj
 * @create 2018-01-08 9:45
 **/
@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("/menu")
    public Menu getMenuById(@Param("menuId") Integer menuId) {
        Menu menu = menuService.selectByPrimaryKey(menuId);
        return menu;
    }
}
