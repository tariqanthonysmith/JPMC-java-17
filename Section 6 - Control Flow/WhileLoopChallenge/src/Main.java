public class Main {

    public static void main(String[] args) {

        int number = 4;
        int countEven = 0;
        int countOdd = 0;
        while (number <= 20) {
            number++;
            if (isEvenNumber(number)) {
                System.out.println(number);
                countEven++;
                if (countEven == 5) {
                    break;
                }
                continue;
            }
            countOdd++;
        }
        System.out.println("Total odd numbers found = " + countOdd);
        System.out.println("Total even numbers found = " + countEven);
    }

    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;
    }
} 