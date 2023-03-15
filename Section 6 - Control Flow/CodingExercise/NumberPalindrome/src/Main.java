public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber= 0;
        while (number != 0) {
            int lastDigit = number % 10;
            number /= 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
        }
        return originalNumber == reverseNumber;
    }
} 