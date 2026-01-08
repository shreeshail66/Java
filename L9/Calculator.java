package L9;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    while(true){
    char op = sc.nextLine().trim().charAt(0);
    if(op=='+'||op=='-'||op=='+'||op=='*'||op=='/'||op=='%'){
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(op == '+'){
            ans = n1+n2;
        }
         if(op == '-'){
            ans = n1-n2;
        }
         if(op == '*'){
            ans = n1*n2;
        }
         if(op == '/'){
            if(n2 !=0){

            ans = n1/n2;
            }
        }
         if(op == '%'){
            ans = n1%n2;
        }
    }else if(op == 'X'||op == 'x'){
           break;
         } else{
            System.out.println("Invalid operation");
        }
        System.out.println(ans);
    }
}

}








   

