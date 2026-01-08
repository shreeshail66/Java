public class MAXiteminRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,18};
        System.out.println(maxRange(arr,1,4));
    }
    static int maxRange(int[] arr,int start,int end){
        int maxval = arr[0];
        for (int i = start; i <=end; i++) {
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
}
}
