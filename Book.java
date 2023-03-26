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

Output:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=5162:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Dell\IdeaProjects\java full stack\out\production\java full stack" Main1
The title is: The Alchemist

Process finished with exit code 0
