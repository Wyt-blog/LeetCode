package day5;

public class id_162_2 {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
