Algorithm:
1.	Initialize two variables: maxSoFar and maxEndingHere to store the maximum sum found so far and the sum of the current subarray, respectively.
2.	Iterate through the array, updating the maxEndingHere as the maximum of the current element and the sum of maxEndingHere and the current element.
3.	Update maxSoFar to the maximum of itself and maxEndingHere.
  
Java Program:

public class Q41 {
    public static int maxSubArraySum(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArraySum(nums));
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
Example:
Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6 (Subarray [4, -1, 2, 1])
