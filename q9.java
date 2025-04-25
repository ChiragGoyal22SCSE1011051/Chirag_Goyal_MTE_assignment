Algorithm:
1.	Sort the array of strings.
2.	Compare characters of the first and last string until they differ.
3.	Return the common characters.
  
Java Program:

import java.util.Arrays;
public class Q9 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) i++;
        return first.substring(0, i);
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}

Time Complexity: O(N log N + M)
Space Complexity: O(1)
Example: Input: ["flower", "flow", "flight"] → Output: "fl"
