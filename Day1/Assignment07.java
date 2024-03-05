/*The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'. */

class Assignment07{
        public static void main(String[] args)
{
int total_students=90;
int boys_gradeA=20;
int gradeA=(total_students*50)/100;
int girls_gradeA=gradeA-boys_gradeA;

System.out.println("The number of girls is" +girls_gradeA);
}
}

