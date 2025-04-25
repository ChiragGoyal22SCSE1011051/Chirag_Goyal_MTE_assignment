Algorithm:
1.	Use dynamic programming or expand around center technique to find the longest palindromic substring.
2.	For each character, try to expand around it to check for both odd and even length palindromes.
  
Java Program:
  
public class Q46 {
    public static String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = expandAroundCenter(s, i, i);
            String even = expandAroundCenter(s, i, i + 1);
            longest = odd.length() > longest.length() ? odd : longest;
            longest = even.length() > longest.length() ? even : longest;
        }
        return longest;
    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}

Time Complexity: O(n^2)
Space Complexity: O(1)
Example:
Input: "babad"
Output: "bab" (or "aba")
