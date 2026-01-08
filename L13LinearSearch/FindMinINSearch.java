public class FindMinINSearch {
    public static void main(String[] args) {
        int[] arr = {35,3,5,7,53,2};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans){// if you want max no.then (arr[i]>ans)
                ans = arr[i];
            }
            
        }
        return ans;
    }
}
