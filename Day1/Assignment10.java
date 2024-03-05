/* Write a program to reverse a 3-digit number. 
E.g.-Number : 132        Output : 231
Input the number using scanner.
  */
import java.util.Scanner;

class Assignment10{
        public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a three digit number");
int number=sc.nextInt();
number1=number%10;
number=number/10;
number2=number%10;
number3=number/10;
int reverse is =(number1*100)+(number2*10)+number3;

System.out.println("The sum of the digts is" +total);
}
}

