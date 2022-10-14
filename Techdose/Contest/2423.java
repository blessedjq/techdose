class Solution {
    boolean find(int[] freq,char ch){
        int index=ch-'a';
        --freq[index];
        int flag=0;
        int val=0;
        for(int i=0;i<26;++i){
            if(flag==0&&freq[i]!=0){
               val=i;
               flag=1; 
            }
            else{
                if(freq[i]!=0&&freq[val]!=freq[i]){
                    ++freq[index];
                    return false;
                }
            }
        }
        ++freq[index];
        return true;
    }
    public boolean equalFrequency(String word) {
        char[] ch=word.toCharArray();
        int[] freq=new int [26];
        for(char i:ch)++freq[i-'a'];
        for(int i=0;i<ch.length;++i){
            if(find(freq,ch[i]))return true;
        }
        return false;
    }
}