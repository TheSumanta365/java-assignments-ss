/*Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5 
Input the number using scanner */
import java.util.Scanner;

class Assignment08{
        public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a five digit number");
int number=sc.nextInt();
number=number/10;
secondLastNumber=number%10;
number=number/10;
number=number/10;
fisrtNumber=number/10;

System.out.println("The first numberr is" +firstNumber);
System.out.println("The second last number is" +secondLastNumber);
}
}

