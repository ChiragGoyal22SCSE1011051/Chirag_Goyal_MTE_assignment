Algorithm:
1.	For each number from 0 to n, count 1s in its binary representation.
  
Java Program:

public class Q21 {
    public static int countBits(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += Integer.bitCount(i);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countBits(5));
    }
}

Time Complexity: O(n log n)
Space Complexity: O(1)
Example: Input: 5 → Output: 7 (binary: 0, 1, 1, 2, 1, 2)
