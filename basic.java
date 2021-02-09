import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int marks = scan.nextInt();
        
        if(marks>100){
            System.out.println("Invalid Marks");
        }
        else if(marks<100 && marks>=90){
            System.out.println("Grade = S");
        }
        else if(marks<90 && marks>=80){
            System.out.println("Grade = A");
        }
        else if(marks<80 && marks>=70){
            System.out.println("Grade = B");
        }
        else if(marks<70 && marks>=60){
            System.out.println("Grade = C");
        }
        else if (marks<60 && marks>=50){
            System.out.println("Grade = D");
        }
        else if(marks<50 && marks>=40){
            System.out.println("Grade = E");
        }
        else{
            System.out.println("Grade = F");
        }
    }
}
