package lc2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAddTwoNumbers {
    @Test
    public void testAddTwoNumbers() {
        ListNode l1 = MainClass.stringToListNode("[2,4,3]");
        ListNode l2 = MainClass.stringToListNode("[5,6,4]");
        ListNode ret = new Solution().addTwoNumbers(l1, l2);
        assertEquals(MainClass.listNodeToString(ret), "[7, 0, 8]");
    }
}
