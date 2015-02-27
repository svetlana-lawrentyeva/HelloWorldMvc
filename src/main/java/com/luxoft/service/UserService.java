package com.luxoft.service;

import com.luxoft.model.User;
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

    @PostConstruct
    public void init(){
        users.add(initUser(1L,"aaaa", "aaaa", "aaaaa"));
        users.add(initUser(2L,"bbbbb", "bbbbb", "bbbbb"));
        users.add(initUser(3L,"ccccc", "ccccc", "ccccc"));
        users.add(initUser(4L,"ddddd", "ddddd", "ddddd"));
    }

    private User initUser(Long id, String firstName, String lastName, String email){
        User user = new User();
        user.setId(id);
        user.setFirstName(firstName);
        user.setFamilyName(lastName);
        user.setEmail(email);
        return user;
    }

    public List<User> findAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }
}
