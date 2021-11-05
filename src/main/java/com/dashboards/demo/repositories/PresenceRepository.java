/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboards.demo.repositories;
import  com.dashboards.demo.model.Presence;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author fadiala.sidibe
 */
@Repository
public interface PresenceRepository extends JpaRepository<Presence, Long>{
     List<Presence> getPresenceByDate(LocalDate localDate); 
}
