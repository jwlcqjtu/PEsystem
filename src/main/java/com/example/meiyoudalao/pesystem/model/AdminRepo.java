package com.example.meiyoudalao.pesystem.model;

import com.example.meiyoudalao.pesystem.model.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Integer>{
    Admin findByUsername2AndPassword2(String username2,String password2);
}
