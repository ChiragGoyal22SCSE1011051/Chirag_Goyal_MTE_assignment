Algorithm:
1.	Use sliding window with hash set.
2.	Expand window until repeat.
3.	Shrink from left until unique.
  
Program:
import java.util.HashSet;
public class LongestUniqueSubstring {
    public static int longestUniqueSubstr(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0, maxLen = 0;
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestUniqueSubstr(s));
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
Example: Input = "abcabcbb", Output = 3 ("abc")
