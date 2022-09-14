import java.util.*;
public class Main{
    public static int fact(int N){
        if(N<=0){
            return 1;
        }
        return fact(N-1)*N;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        System.out.print("factorial:"+fact(N));
    }
}