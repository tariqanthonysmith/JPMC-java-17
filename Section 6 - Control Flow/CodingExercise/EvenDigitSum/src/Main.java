public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum());
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        do {
            int lastDigit = number % 10;
            number /= 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }

        } while (number != 0);
        return sum;
    }
} 