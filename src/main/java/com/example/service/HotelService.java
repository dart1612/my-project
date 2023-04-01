/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.view.HotelView;
import java.util.List;

/**
 *
 * @author jithin123
 */
public interface HotelService {
    
    public List<HotelView> getAllHotelDetails();
    public HotelView getHotelDetailsById(int id);
    public List<HotelView> getHotelDetailsByRegion(String region);
    
}
