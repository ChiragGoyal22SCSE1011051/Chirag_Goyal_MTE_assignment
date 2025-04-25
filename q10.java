Algorithm:
1.	Fix each character at the start and recursively permute the rest.
2.	Swap back after recursion (backtracking).
  
Java Program:

public class Q10 {
    public static void permute(String s, int l, int r) {
        if (l == r) System.out.println(s);
        else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permute(s, l + 1, r);
                s = swap(s, l, i);
            }
        }
    }
    public static String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }
    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length() - 1);
    }
}

Time Complexity: O(n!)
Space Complexity: O(n)
Example: Input: "ABC" → Output: All 6 permutations
