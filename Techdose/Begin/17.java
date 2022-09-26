import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextInt();
        int[] count=new int[126];
        int len=s.length;
        for(int i=0;i<len;i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i<126;i++){
            if(count[i]>0){
                System.out.print(i+":"+count[i]);
            }
        }
    }
}