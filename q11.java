Algorithm:
1.	Use two pointers from left and right.
2.	Move left if sum < target, right if sum > target.
  
Java Program:

public class Q11 {
    public static int[] twoSum(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) return new int[]{arr[i], arr[j]};
            else if (sum < target) i++;
            else j--;
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 11, 15};
        int target = 15;
        int[] result = twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
Example: Input: [1,2,4,7,11,15], Target: 15 → Output: 4 11
