package com.exception.customexception.eg3;

public class MockException extends Throwable{
    MockException(String s){
        super(s);
    }
}
class Custom{
    public static void excep() throws MockException{
        throw new MockException("Mock is used to improve our knowledge...");
    }
    public static void main(String[] args){
        try{
            excep();
        }catch(MockException m){
            m.printStackTrace();
        }
    }
}
