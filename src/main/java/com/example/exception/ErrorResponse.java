/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.exception;

import org.springframework.http.HttpStatus;

/**
 *
 * @author jithin123
 */

public class ErrorResponse {
    private String message;
    private HttpStatus code;
    
    public ErrorResponse(String message, HttpStatus code){
        this.message=message;
        this.code=code;
    }

    
    public String getMessage() {
        return message;
    }

    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public HttpStatus getCode(){
        return code;
    }
    
    public void setCode(HttpStatus code){
        this.code=code;
    }
    
    
    
}
