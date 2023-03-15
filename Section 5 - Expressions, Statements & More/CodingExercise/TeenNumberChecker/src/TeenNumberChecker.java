public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(22, 23, 24));
    }
    public static boolean hasTeen(int num1, int num2, int num3) {

        if (num1 > 12 && num1 < 20) {
            return true;
        }
        if (num2 > 12 && num2 < 20) {
            return true;
        }
        return num3 > 12 && num3 < 20;
    }

    public static boolean isTeen(int num) {

        return num > 12 && num < 20;
    }
}
