import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
    public static void main(String[] args) {
        int[] nums = {4,3,1,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            // swap only if the number is not at its correct position
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // collect missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}