public class bothASEandDES {
    public static void main(String[] args) {
        int arr[] = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int target = 22;
        int ans = bothASEandDES(arr,target);
        System.out.println(ans);
    }
    static int bothASEandDES(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc;
        if (arr[start]<arr[end]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }
        //          O
        //boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]== target){
                return mid;
           }
           if(isAsc){
            if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
           }
           else{
            if(target>arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
           }
        }
        return -1;
    }
    
    }
