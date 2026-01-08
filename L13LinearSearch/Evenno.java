public class Evenno {
    public static void main(String[] args) {
        int[] nums = {1,234,42335,45,222};
        System.out.println(findNumbers(nums));
    }
static int findNumbers(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (even(nums[i])) {
            count++;
        }
    }
    return count;
}
  

    //fun. to check wheaher a no. contains even digit or not
    static boolean even(int num){
        int numberofdigits=digits(num);
        if(numberofdigits%2==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
