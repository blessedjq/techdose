class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        int val=-1,index=len-2;
        while(index>=0&&nums[index+1]<=nums[index])--index;
        int j=nums.length-1;
         if(index>=0){
             while(nums[j]<=nums[index])--j;
             int temp=nums[index];
             nums[index]=nums[j];
             nums[j]=temp;
         }
        int start=index+1,end=nums.length-1;
        while(start<=end){
             int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            ++start;
            --end;
        }
    }
}