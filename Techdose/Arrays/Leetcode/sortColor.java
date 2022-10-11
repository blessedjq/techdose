class Solution {
    public void sortColors(int[] nums) {
        int[] freq=new int[3];
        int[] ans=new int [nums.length];
        for(int i:nums)++freq[i];
        freq[1]+=freq[0];
        freq[2]+=freq[1];
        
        for(int i=nums.length-1;i>=0;--i){
            ans[--freq[nums[i]]]=nums[i];
        }
        for(int i=0;i<nums.length;++i)nums[i]=ans[i];
    }
}