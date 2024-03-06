/*  Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.
 */
import java.util.Scanner;

class Assignment01{
        public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] myArray=new int[10];
for(int i=0;i<10;i++){
myArray[i]=sc.nextInt();
}
System.out.println("Enter your input");
int input=sc.nextInt();
for(int i=0;i<10;i++){
if(myArray[i] == input)
System.out.print("Item found");
else
System.out.print("Item not found");
}
}
}

