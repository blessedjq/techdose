class Main{
    public char toLower(char ch){
        return ((ch|(1<<5)));
    }
    public char toUpper(char ch){
        return ((ch&(!32)));
    }
    public  char toggle(char ch){
        return(ch^32);
    }
    public static void main(String args[]){
        Main obj=new Main();
        System.out.println(obj.toggle('a'));
        System.out.println(obj.toLower('a'));
        System.out.println(obj.toUpper('a'));
    }
}