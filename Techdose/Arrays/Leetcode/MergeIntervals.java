class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,(a,b)->(a[0]-b[0]));
        Stack<int[]> st=new  Stack<>();
        for(int[] val:inter){
            int[] curr=val;
            if(!st.isEmpty()){
                int[] top=st.peek();
                if(top[1]>=curr[0]){
                     st.pop();
                    int start=top[0];
                    int end=Math.max(top[1],curr[1]);
                   st.push(new int[]{start,end});
                }else st.push(curr);
            }else st.push(curr);
        }
        int len=st.size();
        int[][] ans=new int[len][2];
        for(int i=len-1;i>=0;--i){
            ans[i]=st.peek();
            st.pop();
        }
        return ans;
    }
}