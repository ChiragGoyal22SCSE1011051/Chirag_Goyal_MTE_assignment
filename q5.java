Algorithm:
1.	Use sliding window of size K.
2.	Compute initial window sum.
3.	Slide window and update max sum.
  
Program:
public class MaxSumSubarrayK {
    public static int maxSum(int[] arr, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) windowSum += arr[i];
        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        System.out.println(maxSum(arr, k));
    }
}
Time Complexity: O(n)
Space Complexity: O(1)
Example: Maximum sum of size 4 is 24 for subarray [2, 10, 2, 3]
