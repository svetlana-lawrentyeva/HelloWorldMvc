package com.luxoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.luxoft.service.UserService;

/**
 * Created by SCJP on 26.02.2015.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public ModelAndView getUsersView(){
        ModelAndView mav = new ModelAndView("usersView");
        mav.addObject("usersModel", userService.findAll());
        return mav;
    }
}
