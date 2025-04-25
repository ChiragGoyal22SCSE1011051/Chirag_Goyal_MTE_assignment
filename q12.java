Algorithm:
1.	Find the longest non-increasing suffix.
2.	Swap pivot with the smallest greater element.
3.	Reverse the suffix.
  
Java Program:

import java.util.Arrays;
public class Q12 {
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int l = i + 1, r = nums.length - 1;
        while (l < r) {
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
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
Example: Input: [1,2,3] → Output: [1,3,2]
