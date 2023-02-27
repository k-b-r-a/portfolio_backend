/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.k_b_r_a.portfolio.Service;


import org.springframework.stereotype.Service;

import com.k_b_r_a.portfolio.Model.Login;



/**
 *
 * @author kbra
 */

@Service
public interface LoginService{
    public Login fetchUser(String User);
    public Login fetchUserAndPassword(String User, String Password);
 }
 
 