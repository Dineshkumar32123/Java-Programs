package com.project;

abstract interface BankBazaar extends Customer{
    public abstract void loanCategory();
    public abstract void cardsCategory();

    public BankBazaar(long aadharno, String cname) {
        super(aadharno, cname);
    }
    Customer
}

