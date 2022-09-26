import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        int r=0,sum=0,temp;
        temp=x;
    while(x>0)
    {
        r=x%10;
        sum=(sum*10)+r;
        x=x/10;
    }
        if(temp==sum)
            return true;
        else
            return false;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int x=sc.nextInt();
        if(s.isPalindrome(x)==true)
            System.out.println("true");
        else
            System.out.println("false");
    }
}