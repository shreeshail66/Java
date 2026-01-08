package L11FunMeh;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);// output is 90
        int x = 40;
        System.out.println(x);// output is 40
        fun();
        
    }
    static void fun(){
        System.out.println(x);// output is 90
    }
}
