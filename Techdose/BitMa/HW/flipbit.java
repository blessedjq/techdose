class Flip{
    public int flipbit(int n,int b){
        return (n^(1<<(b-1)));
    }
    public static void main(String[] args) {
        Flip obj=new Flip();
        System.out.println(obj.flip(5,2));
    }
}