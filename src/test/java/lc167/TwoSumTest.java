package lc167;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {
    @Test
    public void testMain() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ret = new Solution().twoSum(numbers, target);
        String out = MainClass.integerArrayToString(ret);
        assertEquals(out, "[1, 2]");
    }
}

