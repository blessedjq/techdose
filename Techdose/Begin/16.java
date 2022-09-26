import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        int [][]matrix=new int [row][col];
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                matrix[r][c]=scanner.nextInt();
            }
        }
        for(int c=0;c<col;col++){
            for(int r=0;r<row;r++){
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}