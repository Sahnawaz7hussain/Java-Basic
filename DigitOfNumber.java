public class DigitOfNumber {
    public static void main(String[] args) {
        int num = 12304;
        int digits = CountDigitOfNumber.countDigits(num);
        int divisor = (int) Math.pow(10, (digits - 1));

        while (divisor != 0) {
            int q = num / divisor;
            System.out.println(q);
            num %= divisor;
            divisor /= 10;
        }
    }
}
