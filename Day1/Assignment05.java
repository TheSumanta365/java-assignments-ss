/* Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
A - first program by using a third variable
B - second program without using any third variable */

A. 

class Assignment05{
        public static void main(String[] args)
{
int c=a;
b=c;
a=b;
System.out.println("Now value of a is" +a "and value of b is"+b);
}
}

B.
class Assignment05{
        public static void main(String[] args)
{
        a = a + b;
        b = a - b;
        a = a - b;
System.out.println("Now value of a is" +a "and value of b is"+b);
}
}
