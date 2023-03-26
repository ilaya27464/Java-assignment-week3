interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        if(n<=1000) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
        }
else
            {
                System.out.println("Enter a number within range.");
            }
        return sum;
    }
}

Main Function:

public class Math {
    public static void main(String[] args) {
        MyCalculator m=new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(""+m.divisor_sum(10001));

    }
}


Output:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=6142:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Dell\IdeaProjects\java full stack\out\production\java full stack" Math

I implemented: AdvancedArithmetic
72

Process finished with exit code 0
