class Solution {
    public int maxCount(int[] nums){
        int n= nums.length;
        int count=0;
        int maxCount=0;
        int curr=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            } else{
                maxCount = Math.max(count,maxCount);
                count=0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        return maxCount(nums);
    }
}
