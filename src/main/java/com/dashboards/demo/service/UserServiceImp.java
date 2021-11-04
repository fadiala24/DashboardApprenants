
package com.dashboards.demo.service;

import com.dashboards.demo.model.profil;
import com.dashboards.demo.model.users;
import com.dashboards.demo.repositories.UserRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImp implements UserService{
    
    @Autowired
    UserRepository userRepository;
    
    @Override
    public users getInfoUsersById(Long id) {
      return this.userRepository.findById(id).get();
    }

    @Override
    public users login(String username, String password) {
         users app = userRepository.findByLoginAndPassword(username, password);
        return app;
    }

    @Override
    public String deleteUser(Long id) {
        this.userRepository.deleteById(id);
    return "L'apprenant vient d'être supprimer avec succes";
    }

    @Override
    public String addUsers(users user) {    
       this.userRepository.save(user);
        return "Ajout effectuer avec succes:"+user.getNom()+" "+user.getPrenom();
        
    }

    @Override
    public List<users> listUser() {
       return this.userRepository.findAll();
    }

    @Override
    @Transactional
    public void updateUsers(Long id, users user) {
       users usersExistant = this.userRepository.findById(id).get();
    
    usersExistant.setNom(user.getNom());
    usersExistant.setPrenom(user.getPrenom());
    usersExistant.setAge(user.getAge());
    usersExistant.setTelephone(user.getTelephone());
    usersExistant.setEmail(user.getEmail());
    usersExistant.setLogin(user.getLogin());
    usersExistant.setPassword(user.getPassword());
   usersExistant.setGenre(user.getGenre());
    usersExistant.setDateCreation(user.getDateCreation());
    usersExistant.setDateModification(user.getDateModification());
    }

    @Override
    public List<users> findByProfil(profil type) {
      
     return userRepository.findByProfil(type);

    }
    
}
