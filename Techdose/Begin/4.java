import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int X1=scanner.nextInt();
        int X2=scanner.nextInt();
        int X3=scanner.nextInt();
        int Y1=scanner.nextInt();
        int Y2=scanner.nextInt();
        int Y3=scanner.nextInt();
        double area=Math.abs(1/2(X1(Y1-Y2)+X2(Y1-Y3)+X3(Y1-Y2)));
        System.out.print(area);
    }
}