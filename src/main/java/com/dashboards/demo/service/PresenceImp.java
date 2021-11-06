/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboards.demo.service;

import com.dashboards.demo.model.Presence;
import com.dashboards.demo.repositories.PresenceRepository;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.hibernate.engine.jdbc.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fadiala.sidibe
 */
@Service
public class PresenceImp implements PresenceService {

    @Autowired
    PresenceRepository presenceRepository;
    
    @Override
    public Presence ajout_list(Presence pres) {
     return presenceRepository.save(pres);
    }

   

    @Override
    public List<Presence> getAllPresence() {
    return presenceRepository.findAll();
   
    }

    @Override
    public List<Presence> getPresenceList(LocalDate localDate) {
      return presenceRepository.getPresenceByDate(localDate);

    }

    @Override
    public List<Presence> getPresenceListInterval(LocalDate min, LocalDate max) {
       return presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(min, max);
    }

    @Override
    public List<Presence> getPresenceByDay(LocalDate days) {
      return presenceRepository.getPresenceByDateIs(days);
    }

    
    
    
    @Override
    public List<Presence> getPresenceByMonth(int mois) {
      LocalDate date = LocalDate.now().of(LocalDate.now().getYear(),mois, 1);
      LocalDate debut = date.withDayOfMonth(1);
      LocalDate fin = date.withDayOfMonth(date.lengthOfMonth());
      return presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(debut, fin);
    }
    
}
