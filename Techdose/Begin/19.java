import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n==0){
            System.out.println("Yes");
            System.exit(0);
        }
        for(int i=1;i*i<n;++i){
            if(n%i==0 &&   n/i==i){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}