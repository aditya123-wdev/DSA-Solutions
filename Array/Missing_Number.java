import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sum = Arrays.stream(nums).sum();
        int missing= ((n*(n+1))/2) - sum;
        return missing;
    }
}
