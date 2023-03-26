import java.util.Scanner;

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer class.";
    }
    @Override
    void getNumberOfTeamMembers(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of members in the sport: ");
        int n=sc.nextInt();
        System.out.println( "Each team has "+n+" players in " + getName() );
    }
}