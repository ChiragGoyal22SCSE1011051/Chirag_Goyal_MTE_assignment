Algorithm:
1.	Use a stack to keep track of bar indices.
2.	For each bar, calculate the area formed with the bars in the stack.
  
Java Program:

import java.util.Stack;
public class Q32 {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0, i = 0;
        
        while (i < heights.length) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i++);
            } else {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, h * w);
            }
        }
        
        while (!stack.isEmpty()) {
            int h = heights[stack.pop()];
            int w = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, h * w);
        }
        
        return maxArea;
    }
    
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights));
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
Example:
Input: [2, 1, 5, 6, 2, 3]
Output: 10 (area of rectangle formed by 5 and 6)
