// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Integer {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        // System.out.println(sum(a,b));
        // System.out.println(substract(a,b));
        // System.out.println(multiplication(a,b));
        // System.out.println(devide(a,b));
        // System.out.println(module(a,b));
        // printEven(0, 5);
        // printAreaOfRectangle(4,5);
        // printSquarePattern(5);
        // basicSquare1Pattern();
        // basicTrianglePattern(5);
        // System.out.println(isPrimeNumber(6));
        // printSqrt(6);
        // System.out.println(giveNthTermFibonacci(4));
        System.out.println(giveFactorial(6));

    }

    public static int giveFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        ;

        return n * giveFactorial(n - 1);
    }

    public static int giveNthTermFibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return giveNthTermFibonacci(n - 1) + giveNthTermFibonacci(n - 2);
    }

    public static void printSqrt(int num) {
        System.out.println(Math.sqrt(num));
    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {

                return false;
            }
        }
        return true;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return Math.abs(a - b);
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int devide(int a, int b) {
        return b / a;
    }

    public static int module(int a, int b) {
        return b % a;
    }

    public static void printRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }

    public static void printRangeWhileLoop(int a, int b) {
        while (a <= b) {
            System.out.print(a + " ");
            a++;
        }
    }

    public static void printEven(int a, int b) {
        while (a <= b) {
            if (a % 2 == 0)
                System.out.println(a + " is an even number!");
            a++;
        }
    }

    public static void printAreaOfRectangle(int sideA, int sideB) {
        System.out.println("The area of rectangle is " + (sideA * sideB));
    }

    public static void printSquarePattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(j == num - 1 ? "*" : "* ");
            }
            System.out.println("");
        }
    }

    public static void basicSquare1Pattern() {
        int rows = 4, cols = 4;
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if (row == 1 || row == rows || col == 1 || col == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void basicTrianglePattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}