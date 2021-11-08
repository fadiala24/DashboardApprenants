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
import com.dashboards.demo.service.PresenceService;
import com.dashboards.demo.service.UserService;
import com.dashboards.demo.service.UserServiceImp;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
public class UserController {
   @Autowired 
    UserServiceImp userServiceImp;
   @Autowired 
    UserService userService;
    
    @Autowired
    PresenceImp presenceImp;
    
    @Autowired
    PresenceService presenceService;
    
    
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
   public void addUser(@RequestBody users user)
   {
   userService.save(user);
   
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
    // Les Informations des Utilisateurs par Id
   @GetMapping("/InfoUser/{id}")
   
   public users getInfoUserById(@PathVariable Long id){
   
   return this.userServiceImp.getInfoUsersById(id);
  
   }
   
   // Gestion du Login et du Mot de Passe
   @CrossOrigin("*")
   @GetMapping("/logine/{login}/{password}")
   public users appp(@PathVariable("login") String login,
           @PathVariable("password") String password){
       return this.userServiceImp.login(login, password);
}
   //                                              Liste de Presence Globale
   @GetMapping("/presence")
   public ResponseEntity<List<Presence>> getALlPresence(){
   List<Presence> presenceList = presenceImp.getAllPresence();
   return new ResponseEntity<>(presenceList, HttpStatus.OK);
   
   }
//                                       Presence du Jour
 @GetMapping("/presence/now")
 public List<Presence> getTodayPresenceList(){
         return presenceService.getPresenceList(LocalDate.now());
   }
 //                                            Presence Par intervalle 
 @GetMapping("/presence/interval/{min}&{max}")
 public List<Presence> Interval(@PathVariable("min") @DateTimeFormat(pattern = "yyyy-MM-dd")LocalDate min,
         @PathVariable("max") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate max){
     return presenceImp.getPresenceListInterval(min, max);    
}
 
 //                             Presence par Jour
 @GetMapping("/date/{jour}")
public List<Presence> getDateByDay( @PathVariable("jour") @DateTimeFormat(pattern= "yyyy-MM-dd") LocalDate jour){
    return presenceImp.getPresenceByDay(jour);
}
// Presence par mois 
@GetMapping("/day/{mois}")
public List<Presence> getDateByMonth(@PathVariable int mois){
return presenceImp.getPresenceByMonth(mois);
}
// Presence par Week-end
@GetMapping("/presence/week={year}-{months}-{days}")
public List<Presence> getListByWeek(
        @PathVariable("year") int year, 
        @PathVariable("months") int months,
        @PathVariable("days") int days
){
  return presenceImp.getPresenceByWeek(year, months, days);

}
}

