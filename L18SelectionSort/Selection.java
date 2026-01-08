import java.util.Arrays;
public class Selection {
    public static void main(String[] args) {
        int[] arr= {3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            //Find the max.item n the remaining array and swap with correct index
            int last = arr.length- 1-i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last);
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }

    static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i = start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
