package com.example.meiyoudalao.pesystem.service.impl;

import com.example.meiyoudalao.pesystem.model.AdminRepo;
import com.example.meiyoudalao.pesystem.model.entity.Admin;
import com.example.meiyoudalao.pesystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepo adminRepo;
    @Override
    public Admin Ad(String username2,String password2){
        Admin admin = adminRepo.findByUsername2AndPassword2(username2,password2);
        if (admin == null){
            throw new RuntimeException("USER_NOT_FOUND");
        }
        return admin;
    }
}
