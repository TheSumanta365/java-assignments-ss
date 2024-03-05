/*Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
Input the number using scanner.
  */
import java.util.Scanner;

class Assignment09{
        public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a three digit number");
int number=sc.nextInt();
number1=number%10;
number=number/10;
number2=number%10;
number3=number/10;
int total=number1+number2+number3;

System.out.println("The sum of the digts is" +total);
}
}

