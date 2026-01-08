import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiDimensionArrayLists {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
           List<List<Integer>>list = new ArrayList<>();

           for(int i = 0;i<3;i++){
            list.add(new ArrayList<>());
           }

           //add element
           for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
           }
        }
    }
}
