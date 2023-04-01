/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.impl;

import com.example.entity.Hotel;
import com.example.exception.CustomException;
import com.example.repository.HotelRepository;
import com.example.service.HotelService;
import com.example.view.HotelView;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author jithin123
 */
@Service
public class HotelServiceImpl implements HotelService{
    
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<HotelView> getAllHotelDetails() {
        List<Hotel> hotelList = hotelRepository.findAll();
        List<HotelView> hotelViewList = hotelList.stream().map(h -> new HotelView(h)).collect(Collectors.toList());
        return hotelViewList;
    }

    @Override
    public HotelView getHotelDetailsById(int id) {
        Optional<Hotel> hotel = hotelRepository.findByHotelId(id);
        if(hotel.isPresent()){
            return new HotelView(hotel.get());
        }
        return null;
    }

    @Override
    public List<HotelView> getHotelDetailsByRegion(String region) {
        List<Hotel> hotelList = hotelRepository.findByRegion(region);
        if(hotelList == null || hotelList.isEmpty()){
            throw new CustomException("DETAILS_EMPTY_FOR_REGION_"+region);
        }
        List<HotelView> hotelViewList = hotelList.stream().map(h -> new HotelView(h)).collect(Collectors.toList());
        return hotelViewList;
    }
     
}
