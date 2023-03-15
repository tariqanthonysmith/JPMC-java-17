public class Main {

    public static void main(String[] args) {
        numberToWords(123400);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverse1 = reverse(number);
            int reverse2 = reverse(number);
            do {
                int lastDigit = reverse1 % 10;
                reverse1 /= 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

            } while (reverse1 != 0);
            int reverseDigit = getDigitCount(reverse2);
            while (getDigitCount(number) != reverseDigit) {
                System.out.println("Zero");
                reverseDigit++;
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        do {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        } while (number != 0);
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number != 0);
        return count;
    }

} 