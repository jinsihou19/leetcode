package lc27;

/**
 * @author jinsihou
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i > pos) {
                nums[pos] = nums[i];
            }
            if (nums[i] != val) {
                pos++;
            }
        }
        return pos;
    }
}

