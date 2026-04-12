package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scan.nextInt();

        System.out.println("Enter b:");
        int b = scan.nextInt();


        System.out.println("__________________");
        System.out.println("Enter your choice.");
        System.out.println("1. for addition");
        System.out.println("2. for subtraction");
        System.out.println("3. for multiplication");
        System.out.println("4. for division");
        System.out.println("___________________");
        int choice = scan.nextInt();

        switch(choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Please enter a valid choice!");
        }
        scan.close();
    }
}