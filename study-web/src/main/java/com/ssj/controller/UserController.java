package com.ssj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: SuiShiJie
 * @Description:
 * @Date: Created in 11:08 2018/12/14
 * @Modified By:
 */
@Controller
@RequestMapping("/user")
public class UserController {

     /**
       * @Author: SuiShiJie
       * @Description: 登录
       * @param:  * @param null
       * @Date: 11:48 2018/12/14
       */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(User){

    }


}
