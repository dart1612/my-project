/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author jithin123
 */
//@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomException extends RuntimeException{
    private String message;
    public CustomException(){}
    public CustomException(String message){
        //super(message);
        this.message = message;
    }

    
    
    
}
