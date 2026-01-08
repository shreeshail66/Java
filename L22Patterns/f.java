public class f {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int spaces=1;spaces<=n-i;spaces++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
