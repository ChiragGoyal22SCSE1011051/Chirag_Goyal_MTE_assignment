Algorithm:
1.	Find the length of both linked lists.
2.	Align the two lists by advancing the pointer of the longer list.
3.	Traverse both lists simultaneously to find the intersection node.
  
Java Program:

public class Q49 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }
        
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
    
    private static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        // Example to test the function
    }
}

Time Complexity: O(n + m)
Space Complexity: O(1)
Example:
Intersection at node 8.
