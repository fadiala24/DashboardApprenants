/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboards.demo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author fadiala.sidibe
 */
@Entity
public class Presence {
 @Id   
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id_presence;
 
 @Temporal(TemporalType.DATE)
 Date date_pre;
 
 @Temporal(TemporalType.TIME)
 Date heure_depat;
 
 @Temporal(TemporalType.TIME)
 Date heure_arriver;
 
    @ManyToOne
    private users use;

    public Long getId_presence() {
        return id_presence;
    }

    public void setId_presence(Long id_presence) {
        this.id_presence = id_presence;
    }

    public Date getDate_pre() {
        return date_pre;
    }

    public void setDate_pre(Date date_pre) {
        this.date_pre = date_pre;
    }

    public Date getHeure_depat() {
        return heure_depat;
    }

    public void setHeure_depat(Date heure_depat) {
        this.heure_depat = heure_depat;
    }

    public Date getHeure_arriver() {
        return heure_arriver;
    }

    public void setHeure_arriver(Date heure_arriver) {
        this.heure_arriver = heure_arriver;
    }

    public users getUse() {
        return use;
    }

    public void setUse(users use) {
        this.use = use;
    }
    
 
}
