import java.util.*;
public class Main
{
    static int find(int[] arr,int low,int high){
        int pivot=arr[high];
        int loc=low;
        for(int i=low;i<=high;++i){
            if(pivot>arr[i]){
                int temp=arr[i];
                arr[i]=arr[loc];
                arr[loc]=temp;
                ++loc;
            }
        }
        int temp=arr[high];
        arr[high]=arr[loc];
        arr[loc]=temp;
        
        return loc;
    }
    
    static void findpos(int[] arr,int low,int high,int k){
        int pos=find(arr,low,high);
        int n=arr.length;
		if(pos==n-k)System.out.println(arr[n-k]);
		else if(pos>n-k){
		    findpos(arr,low,pos-1,k);
		}else if(pos<n-k){
		    findpos(arr,pos+1,high,k);
		}
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;++i)arr[i]=sc.nextInt();
		int k=sc.nextInt();
		int low=0;
		int high=n-1;
		findpos(arr,low,high,k);
	}
}