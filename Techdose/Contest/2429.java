class Solution {
    public int minimizeXor(int num1, int num2) {
        int bit1=Integer.bitCount(num1);
        int bit2=Integer.bitCount(num2);
        if(bit1==bit2)return num1;
        if(bit1<bit2)for(int i=bit1;i<bit2;++i)num1=(num1|(num1+1));
        else
            for(int i=bit2;i<bit1;++i)num1=(num1&(num1-1));
        return num1;
    }
}