public class Main {

    public static void main(String[] args) {

        
        countPrime(300,350);
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean countPrime(int begin, int end) {

        if (begin > 1000 || end > 1000) {
            System.out.println("Invalid Value");
            return false;
        }
        int count = 0;
        for (int range = begin; range <= end; range++) {
            if (isPrime(range)) {
                System.out.println(range);
                count++;
            }
            if (count == 3) {
                break;
            }
        }
        return count == 0;
    }
} 