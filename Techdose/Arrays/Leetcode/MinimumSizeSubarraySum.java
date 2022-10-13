class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,ans=nums.length;
        for(int i:nums){
            sum+=i;
            if(i>=target)return 1;
        }
        if(sum<target)return 0;
        sum=0;
        for(int i=0,j=0;i<nums.length&&j<nums.length;++i){
            int c=0;
            while(i<nums.length&&sum<target){
                sum+=nums[i++];
                ++c;
            }
            if(ans>c&&sum>=target)ans=c;
            
            while(j<nums.length&&sum>=target){
                if(c-1<=0)break;
                --c;
                sum-=nums[j++];
                
                while(i<nums.length&&sum<target){
                    sum+=nums[i++];
                    ++c;
                }
                if(ans>c&&sum>=target)ans=c;
            }
            
            if(ans>c&&sum>=target)ans=c;
            
        }
     return ans;                                                  
    }
}