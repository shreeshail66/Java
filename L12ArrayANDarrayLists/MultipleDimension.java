import java.util.Scanner;

public class MultipleDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int nums = sc.nextInt();


       // int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
       int[][] arr = new int[3][3];
       //input loop
          for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        //output loop
        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
         sc.close();
    }
}
