package com.assignment;
import java.util.Scanner;

public class C1Driver {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{

        C1 c = new C1();
        boolean flag = true;


            do {
                System.out.println("\t\tChoose the option:");
                System.out.println("1.Area of Square\n2.Area of Rectangle\n3.Area of Triangle");
                int choice = sc.nextInt();
                Thread.sleep(1000);

            switch (choice) {
                case 1: {
                    System.out.println("Enter the value of a: ");
                    int a = sc.nextInt();
                    Thread.sleep(800);
                    System.out.println("Enter the value of b: ");
                    int b = sc.nextInt();
                    Thread.sleep(1000);
                    System.out.println("The Area of Square is: " + c.areaOfSquare(a));
                    Thread.sleep(800);
                }
                break;
                case 2: {
                    System.out.println("Enter length of rectangle: ");
                    int l = sc.nextInt();
                    Thread.sleep(800);
                    System.out.println("Enter width of rectangle: ");
                    int w = sc.nextInt();
                    Thread.sleep(1000);
                    c.areaOfRectangle(l,w);
                    Thread.sleep(800);
                }
                break;
                case 3: {
                    System.out.println("Enter Base of Triangle: ");
                    double b = sc.nextDouble();
                    Thread.sleep(800);
                    System.out.println("Enter Height of Triangle: ");
                    double h = sc.nextDouble();
                    Thread.sleep(1000);
                    c.areaOfTriangle(b, h);
                    Thread.sleep(800);
                }break;
                case 4: {
                    System.out.println("processing...");
                    Thread.sleep(800);
                    System.err.println("*******Enter the valid number*******");
                    Thread.sleep(1000);
                    flag = false;
                }
                break;
                }
            }while (flag);
        }
}

