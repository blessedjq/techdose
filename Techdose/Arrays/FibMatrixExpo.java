import java.util.*;
public class Main
{
    static int[][] findpow(int mat[][],int[][] val){
        int[][] ans=new int[2][2];
        ans[0][0]=(mat[0][0]*val[0][0])+(mat[0][1]*val[1][0]);
        ans[0][1]=(mat[0][0]*val[0][1])+(mat[0][1]*val[1][1]);
        ans[1][0]=(mat[1][0]*val[0][0])+(mat[1][1]*val[1][0]);
        ans[1][1]=(mat[1][0]*val[0][1])+(mat[1][1]*val[1][1]);
        return ans;
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n==0)System.out.println(0);
	int[][] arr={{1,1},{1,0}};
	int[][] ans=arr;
	if(n>2){
	for(int i=1;i<n-1;++i){
	    ans=findpow(ans,arr);
	}
	}
    System.out.println(ans[0][0]);
	}
}
