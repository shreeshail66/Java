import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
    //     int[] arr = new int[5];
    //     arr[0] = 3;
    //     arr[1] = 354;
    //     arr[2] = 343;
    //     System.out.println(arr[2]);
    // }
    Scanner in = new Scanner(System.in);
    String[] str = new String[4];
    for(int i = 0;i<str.length;i++){

        str[i] = in.next();
    }
     in.close();
    System.out.println(Arrays.toString(str));
 
    }
    
}