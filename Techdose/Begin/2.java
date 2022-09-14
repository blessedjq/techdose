import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int[] GCD=new int[];
        int j=0;
        for(int i=1;i<=A && i<=B ;i++){
            if(A%i==0 && B%i==0){
                GCD[j]=i;
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(GCD[i]+" ");
        }
    }
}