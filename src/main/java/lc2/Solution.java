package lc2;

/**
 * @author jinsihou
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carryFlag = false;
        ListNode first = null;
        ListNode node = null;
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        do {
            int res = (currentNode1 == null ? 0 : currentNode1.val)
                    + (currentNode2 == null ? 0 : currentNode2.val)
                    + (carryFlag ? 1 : 0);
            if (res > 9) {
                res -= 10;
                carryFlag = true;
            } else {
                carryFlag = false;
            }
            ListNode resNode = new ListNode(res);
            if (first == null) {
                first = resNode;
            } else {
                node.next = resNode;
            }
            node = resNode;
            currentNode1 = currentNode1 == null ? null : currentNode1.next;
            currentNode2 = currentNode2 == null ? null : currentNode2.next;
        } while (currentNode1 != null || currentNode2 != null || carryFlag);
        return first;
    }
}
