Algorithm:
1.	Reverse the second half of the number and compare it with the first half.
  
Java Program:

public class Q29 {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
}

Time Complexity: O(log n)
Space Complexity: O(1)
Example: Input: 121 → Output: true
