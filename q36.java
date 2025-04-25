Algorithm:
1.	Use bit manipulation or backtracking to generate all possible subsets of the array.
  
Java Program:

public class Q36 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Add the empty subset
        
        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                newSubset.add(num);
                result.add(newSubset);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}

Time Complexity: O(2^n)
Space Complexity: O(2^n)
Example:
Input: [1,2,3]
Output: [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
