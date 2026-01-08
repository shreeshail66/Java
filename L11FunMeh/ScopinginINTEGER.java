package L11FunMeh;

public class ScopinginINTEGER {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
           //Error //int a= 78;//Already initialised above


            a = 100;// Reassign the original Reference Vaiable to some other value

            System.out.println(a);// output is 100
            System.out.println(b);// using variable b
            int c = 54;
            System.out.println(c);// using variable c
        }
        System.out.println(a);// output is 100
     //Error  // System.out.println(c);// canot use outside the block

    }
}
