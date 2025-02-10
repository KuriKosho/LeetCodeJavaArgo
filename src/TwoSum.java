import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i]; // Số cần tìm
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i}; // Trả về vị trí của hai số
            }
            map.put(nums[i], i); // Lưu {giá trị: vị trí}
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {3,2,4};
        int target = 6;
        int[] res = ts.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
