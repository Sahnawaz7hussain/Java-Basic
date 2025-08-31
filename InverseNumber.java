import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int num = scn.nextInt();

        System.out.println("Inverse of the number is : ");
        inverseANumber(num);
        inverseANumber2(num);
        scn.close();
    }

    public static void inverseANumber(int num) {
        int inv = 0;
        int originalPosition = 1;
        while (num != 0) {
            int originalDigit = num % 10;
            int inverseDigit = originalPosition;
            int inversePosition = originalDigit;
            inv = inv + inverseDigit * (int) Math.pow(10, (inversePosition - 1));

            num = num / 10;
            originalPosition++;
        }
        System.out.println(inv);
    }

    public static void inverseANumber2(int num) {
        int result = 0;
        int counter = 1;
        while (num != 0) {
            result += counter * (int) Math.pow(10, (num % 10) - 1);
            num /= 10;
            counter++;
        }
        System.out.println(result);
    }
}
