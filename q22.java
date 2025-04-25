Algorithm:
1.	A number is a power of two if it has only one bit set, i.e., n & (n - 1) == 0.
  
Java Program:

public class Q22 {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}

Time Complexity: O(1)
Space Complexity: O(1)
Example: Input: 16 → Output: true
