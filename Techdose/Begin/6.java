import java.util.*;
public class Main{
    public static void static(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        for(int i=1;i<N;++i){
            for(int j=1;j<=i;++j){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}