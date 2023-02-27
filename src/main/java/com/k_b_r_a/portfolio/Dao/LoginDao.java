/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.k_b_r_a.portfolio.Dao;


import com.k_b_r_a.portfolio.Model.Login;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kbra
 */
public interface LoginDao extends JpaRepository<Login, Integer> {
    public Login findByUser(String User);
    public Login findByUserAndPassword(String User, String Password);
}
