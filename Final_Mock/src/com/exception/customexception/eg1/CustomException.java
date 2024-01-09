package com.exception.customexception.eg1;

public class CustomException {
    public static void m1() throws LifeException{
        throw new LifeException("This is new exception that programmer is created");
    }

    public static void main(String[] args) {
        try {
            m1();
        }catch (LifeException e){
            e.printStackTrace();
        }
    }
}
