package L11FunMeh;

//Case 1:FunctonOverloading : Two or more fun having same name but diff. arguments[int, String......S] 

 public class FunctonOverloading {
 //public static void main(String[] args) {
//        // fun(67);
//         fun("shree");
//     }
//     static void fun(int a){
//         System.out.println(a);
//     }
//      static void fun(String Name){
//         System.out.println(Name);
//     }
    

//Case 2: No. of Arguments

public static void main(String[] args) {
int ans = sum(2,3);
System.out.println(ans);
}
static int sum(int a, int b){
    return a+b;
}
static int sum(int a, int b,int c){
    return a+b+c;
}
 }