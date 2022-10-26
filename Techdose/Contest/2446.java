class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        String[] s1=event1[0].split(":");
        String[] s2=event1[1].split(":");
        String[] s3=event2[0].split(":");
        String[] s4=event2[1].split(":");
        
        float t1=(s1[0].charAt(0)-'0')*10+(s1[0].charAt(1)-'0')+((float)((s1[1].charAt(0)-'0')*10+(s1[1].charAt(1)-'0'))/100);
        float t2=(s2[0].charAt(0)-'0')*10+(s2[0].charAt(1)-'0')+((float)((s2[1].charAt(0)-'0')*10+(s2[1].charAt(1)-'0'))/100);
        float t3=(s3[0].charAt(0)-'0')*10+(s3[0].charAt(1)-'0')+((float)((s3[1].charAt(0)-'0')*10+(s3[1].charAt(1)-'0'))/100);
        float t4=(s4[0].charAt(0)-'0')*10+(s4[0].charAt(1)-'0')+((float)((s4[1].charAt(0)-'0')*10+(s4[1].charAt(1)-'0'))/100);
if((t1<=t3 && t3<=t2) || (t1<=t4 && t4<=t2) || (t3<=t1 && t1<=t4) || (t2>=t3 && t4>=t2)) return true;
        
        return false;
    }
}