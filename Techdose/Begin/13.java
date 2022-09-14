import java.util.*;
public class Main{
    public static void main(String[] args){
        Scannner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int [][]pascal = new int[N+1][N+1];
        pascal[0][0]=1;
        for(int i=1;i<=N;++i){
            pascal[i][0]=1;
            pascal[i][i]=1;
            for(int j=1;j<i;j++){
                pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
            }
        }
        for(int i=0;i<=N;++i){
            for(int j=0;j<=i;++j){
                System.out.println(pascal[i][j]+" ");
            }
            System.out.println();
        }
    }
}