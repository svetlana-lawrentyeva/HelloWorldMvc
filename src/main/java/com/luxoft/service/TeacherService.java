package com.luxoft.service;

import com.luxoft.model.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Svetlana Lawrentyeva on 02.03.15.
 */

@Service
public class TeacherService {

    List<Teacher> teachers = new ArrayList<>();

    @PostConstruct
    public void init(){
        teachers.add(initTeacher(1L, "fff", "ppp", "jnjn"));
        teachers.add(initTeacher(2L, "sds", "xcc", "bhbb"));
    }


    private Teacher initTeacher(Long id, String firstName, String lastName, String email){
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setFirstName(firstName);
        teacher.setFamilyName(lastName);
        teacher.setEmail(email);
        return teacher;
    }

    public Teacher getById(long id) {
        for(Teacher teacher:teachers){
            if(teacher.getId()==id)return teacher;
        }
        return null;
    }

    public List<Teacher>findAll(){
        return teachers;
    }
}
