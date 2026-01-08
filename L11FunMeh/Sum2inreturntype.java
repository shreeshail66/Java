package L11FunMeh;

import java.util.Scanner;

public class Sum2inreturntype {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
       // System.out.println(sum2());

    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1+n2;
         return sum;
        
    }
}
