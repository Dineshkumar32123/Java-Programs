package tabrez;

import java.util.Scanner;

public class CupDriver {
    static Cup cup = new Cup("Glass","Gold","India");
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

    boolean flag = true;
        do {
            System.out.println("\t\t\tSelect the input: ");
            System.out.println("1.Add coffee\n2.Remove coffee\n3.Coffee present or not\n4.Details of Cup\n5.Details of Coffee\n6.Exit");
            int choice = sc.nextInt();
            Thread.sleep(600);
            switch (choice){
                case 1:{
                    Thread.sleep(800);
                    cup.addCoffee(new Coffee("Bru",250,5000));
                    break;
                }
                case 2:{
                    Thread.sleep(800);
                    cup.removeCoffee();
                    break;
                }
                case 3:{
                    if (cup.isCoffeePresent()){
                        Thread.sleep(800);
                        System.out.println("Cup contains "+cup.is_coffee.coffee_name+" coffee");
                    }
                    else {
                        Thread.sleep(800);
                        System.out.println("Cup is empty only..Please add some coffee...");
                    }
                        break;
                }
                case 4:{
                    Thread.sleep(800);
                    cup.detailsOfCup();
                break;
                }
                case 5:{
                    Thread.sleep(800);
                    cup.is_coffee.detailsOfCoffee(new Coffee("Bru",250,5000));
                    break;
                }
                case 6:{
                    Thread.sleep(800);
                    System.out.println("Loading...");
                    Thread.sleep(1000);
                    System.out.println("\t\t************Thank You************");
                    flag=false;
                    break;
                }
                default:
                    System.out.println("Enter valid Input");

            }

        }while(flag);
    }
}
