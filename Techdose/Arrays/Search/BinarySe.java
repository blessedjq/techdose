import java.util.*;
public class Main
{
   static int find(int[] arr,int low,int high,int k){
       if(low<high){
       int mid=low+(high-low)/2;
       if(arr[mid]==k)return mid;
       else if(arr[mid]<k) {
           return find(arr,mid+1,high,k);
       }
       else  return find(arr,low,mid-1,k);
       }
       return -1;
   }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;++i)arr[i]=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(find(arr,0,n-1,k));
	}
}