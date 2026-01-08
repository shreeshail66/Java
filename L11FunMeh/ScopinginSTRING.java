package L11FunMeh;
public class ScopinginSTRING {
    public static void main(String[] args) {
        String name = "kunal";
        {
            name = "Rahul";
            System.out.println(name);//Replace kunal with Rahul
        }
    }
}
