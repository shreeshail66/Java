import java.util.Arrays;

public class SearchIN2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {2,3,4},
            {45,245,3545},
            {532,56,23,9}
        };
        int target = 23;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans)); 
    }
    static int[] search(int[][] arr,int target){
        for(int row = 0;row<arr.length;row++){
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column] == target){
                    return new int[]{row,column};
                }
            }
        }
        return new int[]{-1,-1};
    }


}
