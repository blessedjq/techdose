import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] array=new int[N];
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[n-2]);
    }
}