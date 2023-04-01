/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.view;

import com.example.entity.Hotel;

/**
 *
 * @author jithin123
 */
public class HotelView {
    private int id;
    private String name;
    private String address;
    private int pnone;
    private String region;
    
    public HotelView(){
    }
    
    public HotelView(Hotel hotel){
        this.id = hotel.getHotelId();
        this.name = hotel.getName();
        this.address = hotel.getAddress();
        this.pnone = hotel.getPnone();
        this.region = hotel.getRegion();
    }

   
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the pnone
     */
    public int getPnone() {
        return pnone;
    }

    /**
     * @param pnone the pnone to set
     */
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
