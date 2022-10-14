class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int val1=nums1[0];
        int val2=nums2[0];
        for(int i=1;i<nums1.length;++i)val1^=nums1[i];
        for(int i=1;i<nums2.length;++i)val2^=nums2[i];
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1%2==0&&n2%2==0)return 0;
        if(n1%2==0&&n2%2!=0)return val1;
        if(n1%2!=0&&n2%2==0)return val2;
        return val1^val2;
    }
}