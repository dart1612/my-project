/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.form;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jithin123
 */
public class HotelSearchForm {
    
    @NotNull(message = "region can not be null")
    private String reg;
    
    public HotelSearchForm(){}

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @param reg the reg to set
     */
    public void setReg(String reg) {
        this.reg = reg;
    }
    
    
}
