package L9;

import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        
        Scanner dc = new Scanner(System.in);
            int a = dc.nextInt();
            int b = dc.nextInt();
            int c = dc.nextInt();
           // int max = a;
            // if(b > max){
            //     max = b;
            // }
            // if(c > max){
            //     max = c;
            // }
            // System.out.print(max);
            int max = 0;
            if(a>b){
                max= a;
            }else{
                max = b;
            }
            if(c>max){
                max = c;
            }
            System.out.println(max);

        }
    }

