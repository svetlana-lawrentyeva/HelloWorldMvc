package com.luxoft.service;

import com.luxoft.model.Teacher;
import com.luxoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SCJP on 26.02.2015.
 */

@Service
public class UserService {

    ArrayList<User>users = new ArrayList<User>();
    @Autowired TeacherService teacherService;

    @PostConstruct
    public void init(){

        users.add(initUser(1L,"aaaa", "aaaa", "aaaaa", teacherService.getById(2L)));
        users.add(initUser(2L, "bbbbb", "bbbbb", "bbbbb", teacherService.getById(1L)));
        users.add(initUser(3L, "ccccc", "ccccc", "ccccc", teacherService.getById(2L)));
        users.add(initUser(4L, "ddddd", "ddddd", "ddddd", teacherService.getById(1L)));
    }

    private User initUser(Long id, String firstName, String lastName, String email, Teacher teacher){

        User user = new User();
        user.setId(id);
        user.setFirstName(firstName);
        user.setFamilyName(lastName);
        user.setEmail(email);
        user.setTeacher(teacher);
        return user;
    }

    public List<User> findAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }
}
