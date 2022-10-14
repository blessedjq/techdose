class Solution {
    public int commonFactors(int a, int b) {
        int min=a>b?b:a;
        int c=0;
        for(int i=1;i<=min;++i){
            if(a%i==0&b%i==0)++c;
        }
        return c;
    }
}