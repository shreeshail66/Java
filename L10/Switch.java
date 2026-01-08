import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        switch(fruit){
            case "Mango":
            System.out.println("king");
            break;
            case "Apple":
            System.out.println("Red fruit");
            break;
            case "Banana":
            System.out.println("Yellow fruit");
            break;
            default:System.out.println("Invalid fruit mane");
            
            
        }
    }
}
