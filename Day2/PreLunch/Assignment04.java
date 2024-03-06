/*4. Take 10 integers from keyboard using loop and print their average value on the screen.*/
import java.util.Scanner;

class Assignment04{
        public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int total=0;
System.out.println("Input 10 integers");
for(int i=1;i<=10;i++)
{
int number=sc.nextInt();
total+=number;
}
int average=total/10;

System.out.println("Average value is" +average);
}
}
