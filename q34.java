Algorithm:
1.	Use a hash map to store the cumulative sum and its frequency.
2.	At each element, check if the difference between the cumulative sum and K is present in the map.
  
Java Program:

import java.util.HashMap;
public class Q34 {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: sum 0 occurs once
        int sum = 0, count = 0;
        
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
Example:
Input: [1,1,1], k = 2
Output: 2 (subarrays [1,1] and [1,1])
