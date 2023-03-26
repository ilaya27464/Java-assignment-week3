import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter two integers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (Exception e) {
            System.out.println( e);
        }
    }
}

Output:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=7243:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Dell\IdeaProjects\java full stack\out\production\java full stack" Exceptions
Enter two integers: 
hello
java.util.InputMismatchException

Process finished with exit code 0
