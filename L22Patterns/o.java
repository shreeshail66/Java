public class o {
    public static void main(String[] args) {
         pattern17(4);
    }
    static void pattern17(int n) {
        for(int i=1;i<=2*n-i;i++){
            for(int spaces=1;spaces<=n-i;spaces++){
                System.out.print(" ");
            }
            for (int col = 1; col < 2*i-1; col++) {
                System.out.print(col);
             }
             System.out.println();
        }
}
}
