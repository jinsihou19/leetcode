package lc27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {
    @Test
    public void testRemoveElement() {
        Solution s = new Solution();
        assertEquals(s.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2), 5);
        assertEquals(s.removeElement(new int[]{3,2,2,3}, 3), 2);
    }
}
