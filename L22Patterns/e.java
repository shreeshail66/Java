public class e {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for(int row=0; row <= 2 * n - 1; row++){
            int totalColsInrow = row > n ? 2 * n - row : row;
            for(int col = 0; col < totalColsInrow; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
