class Set{
     int countSetBits1(int N){
    int ctr= 0;
    for(int i=1; i<N; i<<=1){
        if(N&i){
            ctr++;
        }
    }
    return ctr;
}

int countSetBits2(int N){
    int ctr = 0;
    while(N){
        N = N&(N-1);
        ctr++;
    }
    return ctr;
}

int countSetBits3(int N){
    int ctr = 0;
    while(N){
        ctr += N&1;
        N >>=1;
    }
    return ctr;
}

int countSetBits4(int N){
    return __builtin_popcount(N);
}


public static void main(String args[]){
    Set obj=new Set();
    System.out.println(obj.countSetBits1(5));
    System.out.println(obj.countSetBits2(5));
    System.out.println(obj.countSetBits3(5));
    System.out.println(obj.countSetBits4(5));
}
}