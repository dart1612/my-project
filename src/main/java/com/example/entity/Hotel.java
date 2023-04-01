/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jithin123
 */
@Entity
public class Hotel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hotelId;
    private String name;
    private String address;
    private int pnone;
    private String region;

    
    public int getHotelId() {
        return hotelId;
    }

    
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    
    public int getPnone() {
        return pnone;
    }

    
    public void setPnone(int pnone) {
        this.pnone = pnone;
    }
    
    public void setRegion(String region){
        this.region = region;
    }
    
    public String getRegion(){
        return region;
    }
    
}
