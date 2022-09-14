import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int [] array=new int[N];
        for(int i=0;i<N;++i){
            array[i]=scanner.nextInt();
        }
        int mean=0;
        for(int i=0;i<N;++i){
            mean+=array[i];
        }
        System.out.print("Mean:"+mean/N+"\n")
    }
}