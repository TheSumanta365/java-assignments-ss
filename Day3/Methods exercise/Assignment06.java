/*
6. Define a method named 'perfect' that determines if parameter number is a perfect number. Use this function in a program that determines and prints all the perfect numbers between 1 and 1000.

[An integer number is said to be "perfect number" if its factors, including 1(but not the number itself), sum to the number. E.g., 6 is a perfect number because 6=1+2+3].
*/
class Assignment06{
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");

        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPerfect(int number) {
        int sum = 1; // Start with 1 as every number is divisible by 1

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }
        }

        return sum == number;
    }
}


