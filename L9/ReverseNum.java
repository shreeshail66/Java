package L9;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 24856;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;      // Get last digit
            num /= 10;               // Remove last digit from num
            ans = ans * 10 + rem;    // Build reversed number
        }

        System.out.println(ans);     // Should print 65842
    }
}
