import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int len=str.length();
        for(int i=0;i<n/2;++i){
            if(str.charAt(i)!=str.charAt(len-1-i)){
                System.out.println("Not Palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}