public class Main {

    public static void main(String[] args) {

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int common = 1;
        for (int i = 2; i <= first || i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                common = i;
            }
        }
        return common;
    }
} 