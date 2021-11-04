/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboards.demo.controller;

import com.dashboards.demo.model.Presence;
import com.dashboards.demo.model.profil;
import com.dashboards.demo.model.users;
import com.dashboards.demo.service.PresenceImp;
import com.dashboards.demo.service.UserServiceImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/APIDASH")
public class UserController {
    
    UserServiceImp userServiceImp;
    
    @Autowired
    PresenceImp presenceImp;
    
    public UserController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }
    /* Affichage de la liste avec la methode Get dans Postman */
    @GetMapping("/ListUser")
   public List<users> listUser(){
   return this.userServiceImp.listUser();
   }
    @GetMapping("/profile={type}")
    public List<users>findByProfil(@PathVariable("type") profil type){
   
   return userServiceImp.findByProfil(type);
    }
   @PostMapping("/addUser")
   public String addUser(@RequestBody users user)
   {
   return this.userServiceImp.addUsers(user);
   
   }
    @DeleteMapping("/deleteUser/{id}")
   public String deleteUser(@PathVariable Long id)
   {
   return this.userServiceImp.deleteUser(id);
   
   }
    @PutMapping("/updateUser/{id}")
    
    public void updateUser (@PathVariable Long id, @RequestBody users user)
    {
    this.userServiceImp.updateUsers(id, user);
    }
   @GetMapping("/InfoUser/{id}")
   
   public users getInfoUserById(@PathVariable Long id){
   
   return this.userServiceImp.getInfoUsersById(id);
  
   }
   @CrossOrigin("*")
   @GetMapping("/logine/{login}/{password}")
   public users appp(@PathVariable("login") String login,
           @PathVariable("password") String password){
       return this.userServiceImp.login(login, password);
}
   @GetMapping("/presence")
   public ResponseEntity<List<Presence>> getALlPresence(){
   List<Presence> presenceList = presenceImp.getAllPresence();
   return new ResponseEntity<>(presenceList, HttpStatus.OK);
   
   }
   @PostMapping("/add_presence")
   public ResponseEntity<Presence> adduser(@RequestBody Presence presence){
   Presence press = presenceImp.ajout_list(presence);
   return new ResponseEntity<>(press, HttpStatus.CREATED);
   }
   
   
}

