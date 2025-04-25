Algorithm:
1.	Use Boyer-Moore Voting Algorithm.
2.	Maintain a count and a candidate.
3.	Traverse through the array, adjusting count and updating candidate when necessary.
  
Java Program:

public class Q16 {
    public static int majorityElement(int[] nums) {
        int count = 0, candidate = -1;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(majorityElement(nums));
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
Example: Input: [3, 3, 4, 2, 4, 4, 2, 4, 4] → Output: 4
