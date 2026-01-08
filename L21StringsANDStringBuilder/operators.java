import java.util.ArrayList;
public class operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//it will print the sum of ascii values of a and
        //output will be 195
        
        
        System.out.println("a"+"b");//it will concatenate a and b
        //output will be ab


        System.out.println('a'+3);//output is 100


        System.out.println("a"+3);//output is a3


          System.out.println("Shreeshail"+new ArrayList<>());//it will print Shreeshail followed by the ArrayList address
           //output is Shreeshail[]


           System.out.println(("Shreeshail")+String.valueOf(56));//it will print Shreeshail56

           //System.out.println(new Integer(56)+new ArrayList<>());//ERROR: because both are non string types
           //At least one operand must be of type String Ex: "Shreeshail" [OR] " "


           //solution: for above error
           System.out.println(" "+Integer.valueOf(56)+new ArrayList<>());
           //output is _56[]


           //Permance
           String series = "";
           for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            series=series+ch;
            System.out.print(ch);
           }


    }
}
