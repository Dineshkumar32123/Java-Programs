package com.project;

import java.util.Scanner;

public class BankBazaar_Imp {
    static Scanner sc = new Scanner(System.in);
    public void loanCategory(){
        System.out.println("1.Personal loan\n2Home loan\n3.Bike loan\n4.Educational loan");
        int choice=sc.nextInt();
        switch (choice){

        }
    }
    public void prsonalLoan(){
        System.out.println("Enter your pincode: ");
        int pin=sc.nextInt();
        System.out.println("Enter current city: ");
        String city=sc.next();
        System.out.println("Select city for your eligibility: ");
        System.out.println("1.Bangalore\n2.Chennai\n3.Mumbai\n4.Detail");
        System.out.println("Enter your mobile number: ");
        long mobile = sc.nextLong();
    }


}
