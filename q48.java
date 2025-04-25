Algorithm:
1.	Traverse the array from right to left to find the first decreasing element.
2.	Swap this element with the smallest element larger than it to the right.
3.	Reverse the subarray to the right of the swapped element.
  
Java Program:

import java.util.*;
public class Q48 {
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
Example:
Input: [1, 2, 3]
Output: [1, 3, 2]
