Algorithm:
1.	Use a hash map to count the frequency of each element.
2.	Iterate through the map to find the element with the highest frequency.
  
Java Program:

import java.util.*;
public class Q40 {
    public static int maxFrequencyElement(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFreq = 0, result = -1;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        System.out.println(maxFrequencyElement(nums));
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
Example:
Input: [1, 1, 2, 2, 2, 3]
Output: 2
