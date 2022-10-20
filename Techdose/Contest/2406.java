class Solution {
    public int minGroups(int[][] intervals) {
        int len=intervals.length;
        int[] l=new int[len];
        int[] r=new int[len];
        for(int i=0;i<len;++i){
            l[i]=intervals[i][0];
            r[i]=intervals[i][1];
        }
        Arrays.sort(l);
        Arrays.sort(r);
        int val=1;
        int i=0,j=0;
        int cal=0;
        while(i<len&&j<len){
            if(l[i]<=r[j]){
                ++cal;
                ++i;
            }else{
                --cal;
                ++j;
            }
            if(cal>val)val=cal;
            
        }
        return val;
    }
}