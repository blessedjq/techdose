class Solution {
    public int majorityElement(int[] nums) {
        int val=0;
        for(int i=0;i<32;++i){
            int bit=1<<i; 
            int count=0;
            for(int dig:nums)if((dig&bit)!=0)++count;
            if(count>(nums.length/2))val|=bit;
        }
        return val;
    }
}