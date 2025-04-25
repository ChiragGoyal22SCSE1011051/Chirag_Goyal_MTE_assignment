Algorithm:
1.	Use two pointers from left and right.
2.	Track maximum heights from both sides and calculate trapped water.
  
Java Program:

public class Q17 {
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1, leftMax = 0, rightMax = 0, result = 0;
        while (left <= right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) leftMax = height[left];
                else result += leftMax - height[left];
                left++;
            } else {
                if (height[right] >= rightMax) rightMax = height[right];
                else result += rightMax - height[right];
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
Example: Input: [0,1,0,2,1,0,1,3,2,1,2,1] → Output: 6
