class Solution {
    public int maxSum(int[][] grid) {
        int max=grid[0][0]+grid[0][1]+grid[0][2]+grid[1][1]+grid[2][0]+grid[2][1]+grid[2][2];
        int[][] pos={{0,0},{0,1},{0,2},{1,1},{2,0},{2,1},{2,2}};
        for(int i=0;i<grid.length-2;++i){
            for(int j=0;j<grid[0].length-2;++j){
                int c=0,sum=0;
                for(int k=0;k<7;++k){
                    int a=i+pos[k][0];
                    int b=j+pos[k][1];
                    if(a<grid.length&&b<grid[0].length){
                        sum+=grid[a][b];
                        ++c;
                    }
                    if(c==7&&max<sum)max=sum;
                }
            }
        }
        return max;
    }
}