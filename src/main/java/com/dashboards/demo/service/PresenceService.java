/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboards.demo.service;

import com.dashboards.demo.model.Presence;
import java.util.Date;
import java.util.List;


/**
 *
 * @author fadiala.sidibe
 */
public interface PresenceService {
    
    Presence ajout_list(Presence pres);
    
    void supp_list(Presence pres);
    
    List<Presence> getAllPresence();
}
