class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length-1;
        for(int i=0;i<nums.length;++i,--len){
            for(int j=i+1,l=len-1;j<nums.length-i;++j,--l){
                if(nums[i]+nums[j]==target)return new int[]{i,j};
                if(nums[len]+nums[l]==target)return new int[]{len,l};
            }
        }
        return new int[]{-1,-1};
    }
}