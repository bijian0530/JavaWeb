package com.test;

import com.pojo.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserServiceTest {
    UserService userService = new UserServiceImpl();
    @Test
    public void registUser(){
        userService.registUser(new User(null,"111111","111111","123456@qq.com"));
    }


    @Test
    public void login(){
        System.out.println(userService.login(new User(null,"admin","admin",null)));
    }


    @Test
    public void existsUsername(){
        if(userService.existsUsername("admin")){
            System.out.println("用户名已经存在");
        }else {
            System.out.println("用户名可以使用");
        }
    }

}
