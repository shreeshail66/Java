import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {

    public static void main(String[] args) {
        // values must be in range 1..n (n = length of array)
        int[] arr = {2, 3, 6, 7, 3, 6, 1, 4};
        System.out.println(findAllDuplicates(arr));
    }

    // method, not class
    public static List<Integer> findAllDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;  // index where arr[i] should go

            // check both: in range AND not already in correct place
            if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                // add the value that is out of place (duplicate)
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
