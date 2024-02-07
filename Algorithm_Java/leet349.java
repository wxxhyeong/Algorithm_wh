import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class leet349 {

    public static void main(String[] args) {
        intersection(new int[]{4, 5, 9}, new int[]{9, 4, 9, 8, 4});
    }

    static public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> result = new HashSet<>();
        Arrays.sort(nums2);

        for (int num : nums1) {
            if (!result.contains(num)) {
                int ans = binarySearch(nums2, num);
                if (ans != -1)
                    result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    static public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int mid = left + (right-left) /2;

            if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid -1;
            else
                return mid;
        }

        return -1;
    }
}
