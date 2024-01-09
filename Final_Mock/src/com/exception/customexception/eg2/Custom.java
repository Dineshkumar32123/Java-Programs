package com.exception.customexception.eg2;

import java.util.Scanner;

public class Custom {
    static Scanner sc = new Scanner(System.in);
    public static void java() throws JavaException{
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num%2==0) {
            throw new JavaException("Number is even");
//            System.out.println("checking");
        }
        else
            throw new JavaException("Number is odd");
    }

    public static void main(String[] args) {
        try{
            java();
        }catch (JavaException j){
            j.printStackTrace();

        }
        finally {
            System.out.println("Hello this is finally block");
            return ;
        }
    }
}
