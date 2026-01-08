package L11FunMeh;

import java.util.Scanner;

public class Exp {
public static void main(String[] args) {
    String greet = Greeing();
    System.out.println("Hello " + greet);
}   
static String Greeing(){
    Scanner sc = new Scanner(System.in);
    String G = sc.nextLine();
    return G;
}
}
