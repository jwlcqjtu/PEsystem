package com.example.meiyoudalao.pesystem.service.impl;

import com.example.meiyoudalao.pesystem.model.DoctorRepo;
import com.example.meiyoudalao.pesystem.model.entity.Doctor;
import com.example.meiyoudalao.pesystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorRepo doctorRepo;
    @Override
    public Doctor Do(String username1,String password1){
        Doctor doctor = doctorRepo.findByUsername1AndPassword1(username1,password1);
        if (doctor == null){
            throw new RuntimeException("USER_NOT_FOUND");
        }
        return doctor;
    }

}
