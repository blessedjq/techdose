class Solution {
    public int maxProfit(int[] p) {
        int[] dp=new int[p.length];
        int max=p[p.length-1];
        for(int i=p.length-1;i>=0;--i){
            if(p[i]>max)max=p[i];
            dp[i]=max;
        }
        int profit=0;
        for(int i=0;i<p.length;++i){
            int val=dp[i]-p[i];
            if(val>profit)profit=val;
        }
        return profit;
    }
}