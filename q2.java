Algorithm:
1.	Build the prefix sum array.
2.	For a range [L, R], compute sum as prefix[R] - prefix[L-1] if L > 0, else prefix[R].
    
Program:
public class PrefixSumRangeQuery {
    public static int[] buildPrefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int rangeSum(int[] prefix, int L, int R) {
        if (L == 0) return prefix[R];
        return prefix[R] - prefix[L - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefix = buildPrefixSum(arr);
        System.out.println(rangeSum(prefix, 1, 3));
    }
}
Time Complexity: O(n) for building prefix sum,
 O(1) per query
Space Complexity: O(n)
Example: For array [2, 4, 6, 8, 10], range [1, 3] -> 4 + 6 + 8 = 18
