/* Write a program to convert Fahrenheit into Celsius. Input the value using scanner */
import java.util.Scanner;

class Assignment06{
        public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value in Fahrenheit");
int fahrenheit=sc.nextInt();
int celcius=((fahrenheit - 32)/9)*5;
System.out.println("The equivalent celcius number is" +celcius);
}
}

