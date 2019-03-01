package com.caibinbing.controller;

import com.caibinbing.bo.UserBo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping(value = "/user/getuserlist")
    @ResponseBody
    public List<UserBo> getUserList() {
        List<UserBo> usrList = new LinkedList<>();
        UserBo user = new UserBo();
        user.setId(1);
        user.setName("user1");
        usrList.add(user);
        return usrList;
    }

}
