Algorithm:
1.	Use backtracking to explore all possible combinations that sum to the target.
  
Java Program:

import java.util.*;
public class Q37 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                current.add(candidates[i]);
                backtrack(candidates, target - candidates[i], i, current, result); // allow same element again
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}

Time Complexity: O(2^n)
Space Complexity: O(target)
Example:
Input: [2, 3, 6, 7], target = 7
Output: [[2, 2, 3], [7]]
