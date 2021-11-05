/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboards.demo.service;

import com.dashboards.demo.model.Presence;
import com.dashboards.demo.repositories.PresenceRepository;
import java.time.LocalDate;
import java.util.List;
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
    public void supp_list(Presence pres) {
        presenceRepository.delete(pres);
    }

    @Override
    public List<Presence> getAllPresence() {
    return presenceRepository.findAll();
   
    }

    @Override
    public List<Presence> getPresenceList(LocalDate localDate) {
      return presenceRepository.getPresenceByDate(localDate);

    }
    
}
