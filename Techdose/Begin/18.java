import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while(n){
            System.out.print(n%10+" ");
            n/=10;
        }
    }
}