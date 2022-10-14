class LUPrefix {
    int[] arr;
    int max=1;
    
    public LUPrefix(int n) {
        arr=new int[n+2];
    }
    
    public void upload(int vid) {
        arr[vid]=1;
        while(arr[max] ==1 ){
            ++max;
        }
    }
    public int longest() {
        return max-1;
    }
}

