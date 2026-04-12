import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello what is your name");
        String name = scan.nextLine();
        System.out.println("What is your age");
        int age = scan.nextInt();
        System.out.println("What's your gpa");
        float gpa = scan.nextFloat();
        
        System.out.println("Hello! "+name+", your age is "+age+".\n"+"Your GPA:- "+gpa);

        scan.close();
    }
}