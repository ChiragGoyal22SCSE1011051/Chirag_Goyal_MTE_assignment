Algorithm (Brute-Force):

1.Initialize maxXOR as O.
2.Use two nested loops to check the XOR of every pair in the array.
3.For every pair (i, j) , compute arr[i] A arr[j]
4.Update maxXOR if this value is greater than the current maxXOR .
5.After checking all pairs, return maxXOR .

  Program:
public class MaxXOR {

    public static int findMaximumXOR(int[] arr) {
        int maxXOR = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int xor = arr[i] ^ arr[j];
                if (xor > maxXOR) {
                    maxXOR = xor;
                }
            }
        }
        return maxXOR;
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 5, 25, 2, 8};
        int result = findMaximumXOR(arr);
        System.out.println("Maximum XOR is: " + result);
    }
}

Time Complexity: O(n^2)
Space Complexity: 0(1) 
Input: arr = {3, 10, 5, 25, 2, 8};
Output: Maximum XOR is: 28
