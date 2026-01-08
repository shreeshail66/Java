package L11FunMeh;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Greeting();
        Greeting();
        Greeting();
    }
    static void Greeting(){
        Scanner sc = new Scanner(System.in);
        String Greeting = sc.nextLine();
        System.out.println(Greeting);
        sc.close();
    }
}
