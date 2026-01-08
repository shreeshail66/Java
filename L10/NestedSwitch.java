import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EmpID = sc.nextInt();
        sc.nextLine();
        String Department = sc.nextLine();
   
        switch (EmpID) {
            case 1:System.out.println("shree");
                break;
                case 2:System.out.println("mahesh");
                break;
                case 3:System.out.println("ganesh");
        switch (Department){
            case"Mechanical":System.out.println("mech Dpt");
            break;
            case"cse":System.out.println("cs Dpt");
            break;
            case"ec":System.out.println("ec Dpt");
            break;
            default:System.out.println("enter valid Dept");
        }
            break;
            
            default:System.out.println("enter valid RollNo.");
                
        }

    }
}