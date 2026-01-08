package L11FunMeh;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isarmStrong(n);
        System.out.println(ans);
    }
    static boolean isarmStrong(int n){
        int original = n;
        int sum = 0;
        while (n>0) {
            int rem = n%10;//1
            n = n/10;
            sum = sum+rem*rem*rem;//9+125+9+9+125+1
        }
        if(sum==original){
            return true;
        }
        return false;
    }
    // static boolean isPrime(int n){
    //     if(n<=1){
    //         return false;
    //     }
    //     int c = 2;
    //     while(c*c<=n){
    //         if(n%c==0){
    //             return false;
    //         }
    //         c++;
    //     }
    //     return sum == original;
    // }
}
