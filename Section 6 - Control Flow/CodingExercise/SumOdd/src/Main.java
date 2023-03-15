public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        if (number < 1) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start < 1 || end < 1 || end < start) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
} 