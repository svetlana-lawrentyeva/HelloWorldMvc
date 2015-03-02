package com.luxoft.controller;

import com.luxoft.model.Teacher;
import com.luxoft.model.User;
import com.luxoft.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.luxoft.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by SCJP on 26.02.2015.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public ModelAndView getUsersView(){
        ModelAndView mav = new ModelAndView("usersView");
        mav.addObject("usersModel", userService.findAll());
        return mav;
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String viewRegistration(Model model) {
        User userForm = new User();
        List<Teacher>teachers = teacherService.findAll();
        model.addAttribute("userForm", userForm);
        model.addAttribute("teachers", teachers);

        return "registration";
    }


    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") User user, BindingResult result) {

        // implement your own registration logic here...
        userService.save(user);

        // for testing purpose:
        System.out.println("username: " + user.getFirstName());
        System.out.println("password: " + user.getFamilyName());
        System.out.println("email: " + user.getEmail());
        System.out.println("birth date: " + user.getId());
        System.out.println("teacher: " + user.getTeacher().getFirstName()+" "+user.getTeacher().getFamilyName());

        return "registrationSuccess";
    }
}
