/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controller;

import com.example.exception.CustomException;
import com.example.exception.ErrorResponse;
import com.example.form.HotelSearchForm;
import com.example.service.HotelService;
import com.example.view.HotelView;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jithin123
 */
@RestController
@RequestMapping("hotels")
@Validated
public class HotelController {
    
    @Autowired
    private HotelService hotelService;
    
    @GetMapping
    public List<HotelView> getAllHotelDetails(){
        return hotelService.getAllHotelDetails();
    }
    
    @GetMapping("{hotelId}")
    public HotelView getHotelDetailsById(@PathVariable(value = "hotelId") int id){
        return hotelService.getHotelDetailsById(id);
    }
    
    @GetMapping("region")
    public List<HotelView> getHotelDetailsById(@Valid @NotNull(message = "jpjj")@RequestParam(name = "reg", required = false) String region){
        return hotelService.getHotelDetailsByRegion(region);
    }
    
    @PostMapping("region")
    public List<HotelView> getHotelDetailsById(@RequestParam(value = "reg", required = false) String region,
            @Valid @RequestBody HotelSearchForm form){
        return hotelService.getHotelDetailsByRegion(form.getReg());
    }
    
    @ExceptionHandler(CustomException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    private ErrorResponse classSpecificExceptionHandler(CustomException e, HttpServletRequest req){
        ErrorResponse er = new ErrorResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        return er;
    }
    
}
