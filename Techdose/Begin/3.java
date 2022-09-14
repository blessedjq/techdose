import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int LCM=(A>B)?A:B;
        while(true){
            if(LCM%A==0 && LCM%B==0){
                System.out.print(LCM);
                break;
            }
            ++LCM;
        }
    }
}