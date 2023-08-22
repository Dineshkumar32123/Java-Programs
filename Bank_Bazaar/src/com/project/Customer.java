package com.project;

public abstract class Customer {
    long aadharno;
    String cname;

    public Customer(long aadharno, String cname) {

        this.aadharno = aadharno;
        this.cname = cname;
    }

    public abstract void citizenship();
}
