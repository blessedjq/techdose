import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    int[] arr=new int[n];
    int max=0;
    for(int i=0;i<n;++i){
        arr[i]=sc.nextInt();
        if(max<arr[i])max=arr[i];
    }
    List<Integer>[] bucket=new List[10];
    for(int i=0;i<10;++i)bucket[i]=new ArrayList<>();
    int em=1;
    for(em=1;max/em>0;em*=10);
    em/=10;
    for(int i=0;i<n;++i){
        int index=arr[i]/em;
        bucket[index].add(arr[i]);
    }
    int j=0;
    for(int i=0;i<10;++i){
        Collections.sort(bucket[i]);
        for(int k:bucket[i])arr[j++]=k;
    }
    for(int i:arr)System.out.print(i+" ");
    
	}
}