package L11FunMeh;

import java.util.Arrays;

//  VariableArgument : We don't know howmany input are giving
public class VariableArgument {
    public static void main(String[] args) {
        
    
    fun(23,4,45,54,53,54);
    }

static void fun(int   ...v){
    System.out.println(Arrays.toString(v));

}
}