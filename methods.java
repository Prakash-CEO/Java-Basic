import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter the Number of Minutes");
        Scanner scan = new Scanner(System.in);
        
        int min = scan.nextInt();
        int year,days,con,com;
        con = 60*24*365;
        year = min/con;
        min = min - (year*con);
        com = 60*24;
        days = min/com;
        System.out.println(year+ " Years and "+days+" Days");
    }
}
