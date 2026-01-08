public class m {
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n){
        for(int i = 1; i <= n; i++){

            // leading spaces
            for(int spaces = 1; spaces <= n - i; spaces++){
                System.out.print(" ");
            }

            // stars + inner spaces
            for(int j = 1; j <= (2 * i - 1); j++){
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");  // edges or last row
                } else {
                    System.out.print(" ");  // hollow part
                }
            }

            System.out.println();
        }
    }
}
