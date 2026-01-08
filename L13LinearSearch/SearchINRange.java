public class SearchINRange {
    public static void main(String[] args) {
        int[] arr = {13,43,56,74,234,453};
        int target = 56;
        int ans = linearSearch(arr,target,1,4);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target,int start,int end){
           if(arr.length== 0){
            return -1;
           }
           for (int i = start; i < end; i++) {
            int element = arr[i];
            if(target == element){
                return i;

            }
            
           }
           return end;
    }
}
