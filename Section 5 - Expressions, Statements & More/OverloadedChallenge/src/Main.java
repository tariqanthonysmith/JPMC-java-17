public class Main {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(12));
        System.out.println(convertToCentimeters(6,0));
    }

    public static double convertToCentimeters(int inches) {

        return (double) (inches * 2.54);
    }

    public static double convertToCentimeters(int feet, int inches) {

        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
} 