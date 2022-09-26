class Solution {
    public int mySqrt(int x) {
        long start=0;
        long end=x;
        while(start+1<end){
            long n=start+(end-start)/2;
            if(n*n==x){
                return (int)n;
            }
            else if(n*n<x){
                start=n;
            }
            else{
                end=n;
            }
        }
        if(n*n==x){
            return (int)end;
        }
        return (int)start;
    }
}