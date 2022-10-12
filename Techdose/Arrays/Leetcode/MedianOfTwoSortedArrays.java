class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int len1=nums1.length;
        int len2=nums2.length;
        int[] arr=new int[len1+len2];
        boolean flag=(len1+len2)%2==0;
        int index=(len1+len2)/2;
        int k=0;
        while(i<len1||j<len2){
            if(i<len1&&j<len2){
                if(nums1[i]<nums2[j])arr[k++]=nums1[i++];
                else arr[k++]=nums2[j++];
            }else if(i<len1)arr[k++]=nums1[i++];
            else if(j<len2)arr[k++]=nums2[j++];
            
            
            if(flag&&k-1==index)return (float)(arr[index]+arr[index-1])/2.0;
            else if((!flag)&&k-1==index)return arr[index];    
        }
        for(int p:arr)System.out.println(p);
        return 0;
    }
}