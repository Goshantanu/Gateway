package com.example.HotelPro.exception;

public class DataNotFoundException extends RuntimeException{
    public DataNotFoundException(String s){
        super(s);
    }
    public DataNotFoundException(){
        super("DATA NOT FOUND !!!");
    }
}
