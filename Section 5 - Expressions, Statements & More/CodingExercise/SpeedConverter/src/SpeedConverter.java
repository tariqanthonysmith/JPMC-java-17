public class SpeedConverter {

    public static void main(String[] args) {

        printConversion(10.25);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        double mph = kilometersPerHour / 1.609;
        return Math.round(mph);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long roundedMpH = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + roundedMpH + " mi/h");
        }
    }
}
