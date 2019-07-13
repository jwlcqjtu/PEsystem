package com.example.meiyoudalao.pesystem.controller;

import com.example.meiyoudalao.pesystem.model.entity.Doctor;
import com.example.meiyoudalao.pesystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @RequestMapping(value = "index1",method = RequestMethod.POST)
    public String Doindex1(LoginForm form, ModelMap modelMap){
        try{
            Doctor doctor = doctorService.Do(form.getUsername(),form.getPassword());
        }
        catch (RuntimeException e){
            e.printStackTrace();
            if (e.getMessage().equals("USER_NOT_FOUND")) {
                modelMap.put("msg", "用户不存在或者密码不匹配");
                return "index";
            }

        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("msg", "系统异常..");

            return "index";
        }
        return "succeed";
    }

}
