class Solution {
    public int longestSubarray(int[] nums) {
    int max=0,c=0,ans=0;
    for(int i:nums)if(i>max)max=i;
    for(int i:nums){
        if(max==i)++c;
        if(max!=i) c=0;
        if(ans<c)ans=c;
    }
    return ans;    
    }
}