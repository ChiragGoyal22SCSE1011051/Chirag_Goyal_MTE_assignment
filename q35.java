Algorithm:
1.	Use a hash map to count the frequency of each element.
2.	Use a priority queue (max-heap) to get the top k frequent elements.
  
Java Program:

import java.util.*;
public class Q35 {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(freqMap.entrySet());
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}

Time Complexity: O(n log k)
Space Complexity: O(n)
Example:
Input: [1,1,1,2,2,3], k = 2
Output: [1, 2]
