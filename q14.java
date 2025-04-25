Algorithm:
1.	Binary search on the smaller array.
2.	Ensure partitioning conditions for median.
  
Java Program:

public class Q14 {
    public static double findMedian(int[] A, int[] B) {
        if (A.length > B.length) return findMedian(B, A);
        int m = A.length, n = B.length;
        int imin = 0, imax = m, halfLen = (m + n + 1) / 2;
        while (imin <= imax) {
            int i = (imin + imax) / 2;
            int j = halfLen - i;
            if (i < m && B[j - 1] > A[i]) imin = i + 1;
            else if (i > 0 && A[i - 1] > B[j]) imax = i - 1;
            else {
                int maxLeft = 0;
                if (i == 0) maxLeft = B[j - 1];
                else if (j == 0) maxLeft = A[i - 1];
                else maxLeft = Math.max(A[i - 1], B[j - 1]);
                if ((m + n) % 2 == 1) return maxLeft;
                int minRight = 0;
                if (i == m) minRight = B[j];
                else if (j == n) minRight = A[i];
                else minRight = Math.min(A[i], B[j]);
                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
    public static void main(String[] args) {
        int[] A = {1, 3};
        int[] B = {2};
        System.out.println(findMedian(A, B));
    }
}

Time Complexity: O(log(min(m,n)))
Space Complexity: O(1)
Example: [1,3] and [2] → Output: 2.0
