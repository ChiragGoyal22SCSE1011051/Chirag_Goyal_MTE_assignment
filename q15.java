Algorithm:
1.	Use binary search from smallest to largest element.
2.	Count how many elements ≤ mid.
  
Java Program:

public class Q15 {
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0], high = matrix[n - 1][n - 1];
        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0, j = n - 1;
            for (int i = 0; i < n; i++) {
                while (j >= 0 && matrix[i][j] > mid) j--;
                count += (j + 1);
            }
            if (count < k) low = mid + 1;
            else high = mid;
        }
        return low;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        System.out.println(kthSmallest(matrix, 8));
    }
}

Time Complexity: O(n log(max - min))
Space Complexity: O(1)
Example: k=8 in given matrix → Output: 13
