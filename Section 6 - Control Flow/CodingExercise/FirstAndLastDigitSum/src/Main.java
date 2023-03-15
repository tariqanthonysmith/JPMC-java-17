public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(6787234));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        if (number < 10) {
            return 2 * number;
        }
        int firstDigit;
        int lastDigit = number % 10;
        number /= 10;
        do {
            firstDigit = number % 10;
            number /= 10;
        } while (number != 0);
        return firstDigit + lastDigit;
    }
} 