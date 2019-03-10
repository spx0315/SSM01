package com.spx.controller;

import com.spx.pojo.User;
import com.spx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("info")
    @ResponseBody
    public List<User> userInfor(){
        System.out.println(userService.getUser().size());
        return userService.getUser();
    }

}
