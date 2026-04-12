import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);

        // 1. solid square
        // ******
        // ******
        // ******
        // ******
        // for(int i = 0; i < 4; ++i){
        //     for(int j = 0; j < 6; ++j){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // 2. right hand triangle
        // *
        // **
        // *** 
        // ****
        // *****
        // System.out.println("Enter the number of rows:- ");
        // int n = scan.nextInt();
        // for(int i = 0; i <n; ++i){
        //     for(int j = 0; j <= i; ++j){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }




        // 3.
        //     *****
        //    *****
        //   *****
        //  *****
        // *****

        // System.out.println("Enter the number of rows:- ");
        // int n = scan.nextInt();

        // for(int i = 1; i <= n; ++i){
        //     for(int space = 1; space <= n-i; ++space){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= n; ++j){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 4.
        // ABCDE
        // ABCD
        // ABC
        // AB
        // A

        // for(int i = 0; i < 5; ++i){
        //     for(int j = 0; j < 5-i; ++j){
        //         System.out.printf("%c", 65+j);
        //     }
        //     System.out.println();
        // }


        // 5.

        System.out.println("Enter the number of rows:- ");
        int n = scan.nextInt();
        
        // for(int i = 0; i < n; ++i){
        //     for(int space = 0; space < n-i; ++space){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j <= i*2; ++j){
        //         if(j == 0 || j == i*2 || i == n-1)
        //             System.out.print("*");
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }






        // 6.

        for(int i = 1; i <= n; ++i){
            for(int j = 0; j <= n+2; ++j){
                if(j == 0 || j == n+2 || i == 1 || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }


        scan.close();
    }
}