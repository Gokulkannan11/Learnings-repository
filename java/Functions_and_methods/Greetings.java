package Functions_and_methods;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
       // String message=  greeting() ;
        //System.out.println(message);
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your name :" );
        String name = in.next();
        String personalgreeting = myGreet(name);
        System.out.println(personalgreeting);

    }
    
    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
}
 
/*static String  greeting(){
    String greeting = "hey ! how are you ?";
    return greeting;
    }
}
*/