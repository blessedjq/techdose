class Solution {
    
    
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
    
    static int findpos(int[] arr,int low,int high,int k){
        int pos=find(arr,low,high);

        int n=arr.length;
		if(pos==n-k)
            return(arr[n-k]);
		else if(pos>n-k) 
            return findpos(arr,low,pos-1,k);
        
		    return findpos(arr,pos+1,high,k);
    }
    public int findKthLargest(int[] arr, int k) {
        int len=arr.length;
        int low=0;
		int high=len-1;
		return findpos(arr,low,high,k);
    }
}