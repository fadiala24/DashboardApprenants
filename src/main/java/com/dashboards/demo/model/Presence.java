/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashboards.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author fadiala.sidibe
 */
@Entity
public class Presence {
 @Id   
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id_presence;
 
 private LocalDate date = LocalDate.now();
 
 private LocalTime arriver = LocalTime.now();

 private LocalTime depart;
 
 
    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private users use;

    public Presence() {
    }
    
    

    public Long getId_presence() {
        return id_presence;
    }

    public void setId_presence(Long id_presence) {
        this.id_presence = id_presence;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getArriver() {
        return arriver;
    }

    public void setArriver(LocalTime arriver) {
        this.arriver = arriver;
    }

    public LocalTime getDepart() {
        return depart;
    }

    public void setDepart(LocalTime depart) {
        this.depart = depart;
    }

    public users getUse() {
        return use;
    }

    public void setUse(users use) {
        this.use = use;
    }

   
}
