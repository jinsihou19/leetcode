package lc35;

/**
 * @author jinsihou
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        return recurbinary(nums, target, 0, nums.length - 1);
    }

    public int recurbinary(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (right + left) / 2;
        if (right - left == 0) {
            if (target <= nums[mid]) {
                return mid;
            } else {
                return mid + 1;
            }
        }
        if (nums[mid] == target) {
            return mid;
        } else if (target < nums[mid]) {
            return recurbinary(nums, target, left, mid);
        }
        return recurbinary(nums, target, mid + 1, right);
    }
}
