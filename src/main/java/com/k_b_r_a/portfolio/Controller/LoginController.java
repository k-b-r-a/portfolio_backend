 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.k_b_r_a.portfolio.Controller;

import com.k_b_r_a.portfolio.Model.Login;
import com.k_b_r_a.portfolio.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kbra
 */
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")

public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Login LoginUser(@RequestBody Login login) throws Exception
    {
        String tempUser = login.getUser();
        String tempPass = login.getPassword();
        Login userObj = null;
        if (tempUser != null && tempPass != null) {
            userObj = loginService.fetchUserAndPassword(tempUser, tempPass);
        }
        if(userObj == null) {
            throw new Exception ("acceso incorrecto");
        }
        return userObj;
    }
}
