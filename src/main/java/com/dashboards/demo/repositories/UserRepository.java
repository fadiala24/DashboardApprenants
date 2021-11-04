/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboards.demo.repositories;

import com.dashboards.demo.model.profil;
import com.dashboards.demo.model.users;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author fadiala.sidibe
 */
public interface UserRepository extends JpaRepository<users, Long>{
    users findByLoginAndPassword(String login, String password);
    List<users>findByProfil(@Param("type")profil type);
    
}
