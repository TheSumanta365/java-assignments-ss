/* Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks.*/
import java.util.Scanner;

class Assignment04{
        public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of Robert in the subjects");
int mark1=sc.nextInt();
int mark2=sc.nextInt();
int mark3=sc.nextInt();
int total_marks= mark1+mark2+mark3;
float percentage=(total_marks/300)*100;
System.out.println("The total marks is" +total_marks);
System.out.println("and the percentage is" +percentage);
}
}