import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        //Syntax
        List<Integer>list = new ArrayList<>(5);
Scanner sc = new Scanner(System.in);
//         list.add(67);
//         list.add(117);
// list.add(77);
//         list.add(1997);
// System.out.println(list);
// list.remove(3);
// System.out.println(list);
// System.out.println(list.contains(67));
// list.set(2, 111);
// System.out.println(list);
//     }
for(int i =0;i<5;i++){
    list.add(sc.nextInt());
}
for(int i = 0;i<5;i++){
    System.out.println(list.get(i)+" ");
}
System.out.println();
sc.close();

    }
}
