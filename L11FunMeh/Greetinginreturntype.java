package L11FunMeh;

import java.util.Scanner;

public class Greetinginreturntype {
    public static void main(String[] args) {
        String Greeting = Greeting2();
        System.out.println(Greeting);
    }
    static String Greeting2(){
        Scanner sc = new Scanner(System.in);
        String Greet = sc.nextLine();
        sc.close();
        return Greet;
        
    }
}
