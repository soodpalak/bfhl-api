package com.example.demo.exception;

import com.example.demo.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseDTO handleException(Exception ex) {

        ResponseDTO response = new ResponseDTO();
        response.set_success(false);
        response.setUser_id("palak_sood_10082005");
        response.setEmail("palak2252.be23@chitkara.edu.in");
        response.setRoll_number("2310992252");

        return response;
    }
}
