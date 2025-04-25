Algorithm:
1.	Use two pointers, one for each list.
2.	Move both pointers through the lists, switching to the other list when they reach the end. 
    The node where they meet is the intersection.
  
Java Program:

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Q27 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode ptrA = headA, ptrB = headB;
        while (ptrA != ptrB) {
            ptrA = (ptrA == null) ? headB : ptrA.next;
            ptrB = (ptrB == null) ? headA : ptrB.next;
        }
        return ptrA;
    }
    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);
        ListNode headA = new ListNode(4);
        headA.next = common;
        ListNode headB = new ListNode(1);
        headB.next = common;
        ListNode intersection = getIntersectionNode(headA, headB);
        System.out.println(intersection.val);
    }
}

Time Complexity: O(n + m)
Space Complexity: O(1)
Example: Intersection at node 8
