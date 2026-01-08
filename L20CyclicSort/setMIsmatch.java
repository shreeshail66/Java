public class setMIsmatch {
    public static void main(String[] args) {
        int[] arr = {2,1,4,2,6,5};
        int[] ans = setMismatch(arr);
        System.out.println(ans[0] + " " + ans[1]);
}

 public static int[] setMismatch(int[] arr) {
    int i=0;
    while(i<arr.length){
        int correct = arr[i]-1;
        if(arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correct]){
            swap(arr,i,correct);
        }
        else{
            i++;
        }
    }
    for (int index = 0; index < arr.length; index++) {
        if(arr[index] != index+1){
            return new int[] {arr[index],index+1};
        }
        
    }
    return new int[] {-1,-1};
 }

static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
