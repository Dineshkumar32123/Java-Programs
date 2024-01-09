package com.exception.customexception.eg1;

public class LifeException extends Throwable{
    LifeException(String s){
        super(s);
    }
    public String getMessage(){
        return "Hello Dinesh";
    }
}
