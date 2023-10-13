package com.aylmerbolzan.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  - Modificadores
 * public
 * private
 * protected
 * 
 */

 @RestController
 @RequestMapping("/users")
public class UserController {
    
    /**
     * String (text)
     * Integer (int) números inteiros
     * Double (double) números 0.000
     * Float (float) números 0.000
     * Char (A C)
     * Date (data)
     * Void (vazio)
     */

     @PostMapping("/")
     public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.name);
     }

}
