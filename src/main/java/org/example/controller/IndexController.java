package org.example.controller;

import org.example.dao.IUserDao;
import org.example.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class IndexController {

    @Autowired
    IUserDao userDao;

    @GetMapping("/index")
    public List<User> index(){
        return userDao.findUserInfo();
    }
}
