/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboards.demo.service;

import com.dashboards.demo.model.Presence;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;


/**
 *
 * @author fadiala.sidibe
 */
@Service
public interface PresenceService {
    List<Presence> getAllPresence();
    List<Presence> getPresenceList(LocalDate localDate);
    Presence ajout_list(Presence pres);
    List<Presence> getPresenceByDay(LocalDate days);
     List<Presence> getPresenceListInterval(LocalDate min, LocalDate max);
     List<Presence> getPresenceByMonth(int mois);
    
}
