package lc206;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseListTest {
    @Test
    public void testSearchInsert() {
        ListNode head = MainClass.stringToListNode("[1,2,3,4,5]");
        ListNode ret = new Solution().reverseList(head);
        assertEquals(MainClass.listNodeToString(ret), "[5, 4, 3, 2, 1]");
    }
}
