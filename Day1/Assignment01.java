/* Write a program to calculate the area and perimeter of the rectangle. Input Length and breadth using command line arguments */

class Assignment01{
        public static void main(String[] args)
{
int length=Integer.parseInt(args[0]);
int breadth=Integer.parseInt(args[1]);
int area=length * breadth;
int perimeter=2*(length+breadth);
System.out.println("The area of the rectangle is" +area);
System.out.println("and the perimeter is" +perimeter);
}
}