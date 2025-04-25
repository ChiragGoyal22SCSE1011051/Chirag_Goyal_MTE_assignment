Algorithm:
1.	Calculate total sum of array.
2.	Iterate through array maintaining left_sum.
3.	At each index, if left_sum == total - left_sum - arr[i]; 
return index.
  
Program:
public class EquilibriumIndex {
    public static int findEquilibriumIndex(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (leftSum == total - leftSum - arr[i]) return i;
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        System.out.println(findEquilibriumIndex(arr));
    }
}
Time Complexity: O(n)
Space Complexity: O(1)
Example: For array [1, 3, 5, 2, 2], index 2 is equilibrium index
