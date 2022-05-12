package br.com.restdemo.demo.configuration.exceptions.datanotfound;

public class DataNotFoundException extends RuntimeException{
    public DataNotFoundException(String message){
        super(message);
    }
}
