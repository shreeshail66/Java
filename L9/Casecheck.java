package L9;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        // String word = "hello";
        // System.out.println(word.charAt(2));
          Scanner sc =  new Scanner(System.in);
         char ch = sc.next().trim().charAt(0);
        if(ch >='a' && ch<='z'){
            System.out.println("Lower caase");
        }
        else{
            System.out.println("upper case");
        }

    }
}
