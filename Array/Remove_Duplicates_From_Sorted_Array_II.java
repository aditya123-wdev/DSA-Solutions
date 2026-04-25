class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0,indx=0;
        int n=nums.length;
        int fast;
        int slow=nums[0];
        for(int i=0;i<n;i++){
            fast=nums[i];
            if(fast==slow){
                count++;
                if(count<=2){
                    nums[indx]=fast;
                    indx++;
                } else{continue;}
            } else{
                slow=fast;
                count=1;
                nums[indx]=slow;
                indx++;
            }
        }
        return indx;
    }
}
