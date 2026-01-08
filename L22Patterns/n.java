public class n {
    public static void main(String[] args) {
        reverseHollowTriangle(5);
    }

    static void reverseHollowTriangle(int n){
        for(int i = n; i >= 1; i--){

            // leading spaces increase each row
            for(int spaces = 1; spaces <= n - i; spaces++){
                System.out.print(" ");
            }

            // stars + inner spaces
            for(int j = 1; j <= (2 * i - 1); j++){
                if (i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*"); // borders or top row
                } else {
                    System.out.print(" "); // hollow part
                }
            }

            System.out.println();
        }
    }
}
