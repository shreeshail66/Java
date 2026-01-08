public class h {
    public static void main(String[] args) {
        pattern8(5);
    }
    static void pattern8(int n){
        for(int i=1;i<=n;i++){
            for(int spaces=1;spaces<=n-i;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
