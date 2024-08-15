package Functions_and_methods;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
       int ans =  sum2(); //Function call
       System.out.println(ans);
        
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum; // once return is executed the function is over
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum =" + sum);

    }
    
/*
     acces modifer  retrurn_type name (arguments) {
     //body
     return statement
}
     .
*/
}