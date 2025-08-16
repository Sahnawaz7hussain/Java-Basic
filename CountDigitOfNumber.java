public class CountDigitOfNumber {
    public static void main(String[] args) {
        int num = 1003;
        System.out.println(countDigits(num));
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
