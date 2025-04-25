Algorithm:
1.	Use a hash set to store the elements of the array as you iterate through.
2.	For each element, check if the difference between the target and the current element is already in the set.
  
Java Program:

import java.util.*;
public class Q44 {
    public static boolean hasPairWithSum(int[] nums, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(hasPairWithSum(nums, target));
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
Example:
Input: [2, 7, 11, 15], target = 9
Output: true (Pair [2, 7])
