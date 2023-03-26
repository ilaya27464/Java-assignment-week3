abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    @Override
    void setTitle(String s){
        title = s;
    }
}

Main Function:

public class Main1{
    public static void main(String[] args){
        MyBook m= new MyBook();
        m.setTitle("The Alchemist");
        System.out.println("The title is: "+m.getTitle());
    }
}
