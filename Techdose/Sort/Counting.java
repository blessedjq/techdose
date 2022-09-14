import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a>b){
	    int tem=a;
	    a=b;
	    b=tem;
	}
	int size=Math.abs(a-b);
	if(size<100){
	    int[] arr=new int[size+1];
	    int[] freq=new int[size+1];
	    int[] ans=new int[size+1];
	    for(int i=0;i<=size;++i){  //frequency
	        arr[i]=sc.nextInt();
	        ++freq[arr[i]-a];
	    }
	    for(int i=1;i<=size;++i){
	        freq[i]=freq[i-1]+freq[i];  //cummulative freq
	    }
	    for(int j=size;j>=0;--j){
	        ans[freq[arr[j]-a]-1]=arr[j]; // making stable sort
	        --freq[arr[j]-a];
	    }
	    for(int k:ans)System.out.print(k+" ");
	    
	}
	}
}
