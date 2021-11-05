/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboards.demo.service;

import com.dashboards.demo.model.profil;
import com.dashboards.demo.model.users;
import java.util.List;

/**
 *
 * @author fadiala.sidibe
 */
public interface UserService {
   public users getInfoUsersById(Long id); 
    public users login(String username, String password);
    public String deleteUser(Long id);
    public void save(users user);
    public List<users> listUser();
     public void updateUsers(Long id, users user);
     List<users>findByProfil(profil type);
    
}
