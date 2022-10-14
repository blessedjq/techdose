class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int[] in=new int[nums.length];
        int[] de=new int[nums.length];
       int start=nums[0],end=nums[0];
        int len=0;
        for(int i=0; i<nums.length; ++i){
            if(nums[i]<=start) ++len;
            else len=1;
            start=nums[i];
            de[i]=len;
        }
        len=0;
        for(int i=0; i<nums.length; ++i){
            if(nums[i]>=end) ++len;
            else len=1;
            end=nums[i];
            in[i]=len;
        } 
        List<Integer> list=new ArrayList<>();
        
        for(int i=k; i<nums.length-k; ++i){
            if(de[i-1]>=k && in[i+k]>=k) list.add(i);
        }
        return list;
    }
}