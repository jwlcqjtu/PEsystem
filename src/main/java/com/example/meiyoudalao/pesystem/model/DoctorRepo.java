package com.example.meiyoudalao.pesystem.model;

import com.example.meiyoudalao.pesystem.model.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor,Integer> {
    Doctor findByUsername1AndPassword1(String username1,String password1);
}
