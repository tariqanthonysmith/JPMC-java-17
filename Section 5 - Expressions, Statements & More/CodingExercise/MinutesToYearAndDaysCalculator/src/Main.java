public class Main {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long year = minutes / (60L * 24L * 365L);
            long remainingMinutes = minutes % (60L * 24L * 365L);
            long days = remainingMinutes / (60L * 24L);

            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }
} 