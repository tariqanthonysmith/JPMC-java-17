public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(65));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int prime = -1;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0 && i != j) {
                        break;
                    }
                    if (i % j == 0 && i == j) {
                        prime = j;
                    }
                }
            }
        }
        return prime;
    }
} 