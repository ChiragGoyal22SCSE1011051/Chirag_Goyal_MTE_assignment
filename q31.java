Algorithm:
1.	Use a deque to store indices of array elements.
2.	Ensure the deque holds indices of elements in decreasing order.
3.	Slide the window from left to right, adding elements to the deque and removing elements out of the window.
  
Java Program:

import java.util.*;

public class Q31 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            // Remove elements not in the window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            // Remove smaller elements from the deque
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}

Time Complexity: O(n)
Space Complexity: O(k)
Example:
Input: [1,3,-1,-3,5,3,6,7], k = 3
Output: [3, 3, 5, 5, 6, 7]
