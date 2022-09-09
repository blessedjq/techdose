class Solution {
    public int hammingDistance(int x, int y) {
        int ctr=x^y,count=0;
        while(ctr!=0){
            if((ctr&1)==1)++count;
            ctr>>=1;
        }
        return count;
    }
}