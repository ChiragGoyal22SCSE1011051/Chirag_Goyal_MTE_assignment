Algorithm:
1.	Use recursion or iteration to merge node by node based on value.
  
Java Program:

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Q13 {
    public static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(3);
        ListNode b = new ListNode(2);
        b.next = new ListNode(4);
        ListNode res = merge(a, b);
        printList(res);
    }
}

Time Complexity: O(n + m)
Space Complexity: O(n + m) (recursion)
Example: 1→3 and 2→4 → Output: 1→2→3→4
