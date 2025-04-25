Algorithm:
1.	Use two pointers, one ahead by n steps.
2.	Move both pointers until the first pointer reaches the end.
  
Java Program:

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Q26 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        for (int i = 1; i <= n + 1; i++) fast = fast.next;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = removeNthFromEnd(head, 2);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
Example: Input: [1, 2, 3, 4, 5], n = 2 → Output: [1, 2, 3, 5]
