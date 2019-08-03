package lc35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest {
    @Test
    public void testSearchInsert() {
        int[] nums = new int[]{1, 3, 5, 6};
        Solution s = new Solution();
        assertEquals(s.searchInsert(nums, 5), 2);
        assertEquals(s.searchInsert(nums, 2), 1);
        assertEquals(s.searchInsert(nums, 7), 4);
        assertEquals(s.searchInsert(nums, 0), 0);
    }
}

