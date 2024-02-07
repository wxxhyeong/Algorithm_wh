package algorithm;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {




    }

    public int search(int[] nums, int target) {
        Arrays.sort(nums);

        binarySearch(nums, target, 0, nums.length - 1);

        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid -1;
            else return mid;
        }

        return -1;

    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        if (left < right) {
            int mid = (left+right) / 2;

            if (nums[mid] < target)
                return binarySearch(nums, target, mid + 1, right);
            else if (nums[mid] > target)
                return binarySearch(nums, target, left, mid - 1);
            else // 정답을 찾은 경우
                return mid;
        }
        else
            return -1;
    }

    public int search2(int[] nums, int target) {
        return Arrays.binarySearch(nums, target) >= 0 ? Arrays.binarySearch(nums, target) : -1;
    }
}
