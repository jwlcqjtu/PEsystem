package com.example.meiyoudalao.pesystem.service.impl;

import com.example.meiyoudalao.pesystem.model.StudentRepo;
import com.example.meiyoudalao.pesystem.model.entity.Student;
import com.example.meiyoudalao.pesystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public Student St(String username,String password)
    {
        Student student = studentRepo.findByUsernameAndPassword(username,password);
        if (student == null){
            throw new RuntimeException("USER_NOT_FOUND");
        }
        return student;
    }
}