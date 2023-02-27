/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.k_b_r_a.portfolio.Service;
import com.k_b_r_a.portfolio.Dao.LoginDao;
import com.k_b_r_a.portfolio.Model.Login;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author kbra
 */
@Service
public class LoginServiceImplement implements LoginService{
    @Autowired
    private LoginDao loginDao;
     
    public Login fetchUser(String User){
         return loginDao.findByUser(User);
    }
 
    public Login fetchUserAndPassword(String User, String Password){
         return loginDao.findByUserAndPassword(User, Password);
    }
 }

