public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
        int lastDigitNum1 = num1 % 10;
        int fistDigitNum1 = (num1 / 10) % 10;
        int lastDigitNum2 = num2 % 10;
        int fistDigitNum2 = (num2 / 10) % 10;
        return lastDigitNum1 == lastDigitNum2 || lastDigitNum1 == fistDigitNum2
                || fistDigitNum1 == lastDigitNum2 || fistDigitNum1 == fistDigitNum2;
    }
} 