public class l {
    public static void main(String[] args) {
        pattern8(5);
    }
    static void pattern8(int n){
        for(int i=1;i<=2*n;i++){
            int val=i>n?2*n-i:i;
            for(int spaces=1;spaces<=n-1+val;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-val+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}