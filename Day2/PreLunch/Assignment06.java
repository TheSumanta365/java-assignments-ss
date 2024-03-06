/* Print the following patterns using loop :
 Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.
*/
import java.util.Scanner;

class Assignment06{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int sum=0,product=1,count=0;
System.out.println("Enter a number or press Q");
String input=sc.nextLine();
if(input.equals("q"))
{
System.out.println("You chose to quit");
break;
} 
else
{
count++;
sum+=input;
average=sum/count;
product*=input;
}
while(count!=0)
{
System.out.println("Average is " +average);
System.out.println("Product is " +product);
}
}
}




