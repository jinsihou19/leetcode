package lc3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLongestSubstring {
    @Test
    public void testLengthOfLongestSubstring() {
        Solution solution = new Solution();
        assertEquals(solution.lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(solution.lengthOfLongestSubstring("bbbbb"), 1);
        assertEquals(solution.lengthOfLongestSubstring("pwwkew"), 3);
    }
}
