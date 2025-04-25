Algorithm:
1.	Use a stack to keep track of indices.
2.	Traverse the array from right to left and find the next greater element.
  
Java Program:

import java.util.Arrays;
import java.util.Stack;
public class Q25 {
    public static int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                result[stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10};
        System.out.println(Arrays.toString(nextGreaterElement(nums)));
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
Example: Input: [4, 5, 2, 10] → Output: [5, 10, 10, -1]
