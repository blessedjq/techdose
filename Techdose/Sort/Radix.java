class Solution {
    
    public void countingSort(int[] arr,int em){
        int[] freq=new int[10];
        for(int i=0;i<arr.length;++i){
            int d=(arr[i]/em)%10;
            ++freq[d];
            }
        for(int i=1;i<10;++i) freq[i]+=freq[i-1];
        int[] temp=new int[arr.length];
        for(int i=arr.length-1;i>=0;--i){
            int d=(arr[i]/em)%10;
            temp[--freq[d]]=arr[i];
        }
        for(int i=0;i<arr.length;++i)arr[i]=temp[i];
    }
    
    
    public int[] sortArray(int[] nums) {
        int em=1,max=0;
        for(int i:nums)if(i>max)max=i;
            
         for(int i=1;max/i>0;i*=10){
            countingSort(nums,i);
         }
        return nums;
        
    }
}