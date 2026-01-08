package L11FunMeh;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum= n1+n2;
        System.out.println(sum);
        sc.close();
    }
}
