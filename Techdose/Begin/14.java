import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        if(N==0){
            System.out.println("Yes");
            System.exit(0);
        }
        for(int i=1;i*i<N;++i){
            if(N%i==0 &&   N/i==i){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}