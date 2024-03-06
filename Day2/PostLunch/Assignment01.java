/* 1. Take 10 integer inputs from user and store them in an array and print them on screen.
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
for(int i=0;i<10;i++){
System.out.print(myArray[i] + " ");
}
}
}

