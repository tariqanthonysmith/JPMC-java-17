public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(-3, 2, 11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        bigCount *= 5;
        if (bigCount >= goal && goal % 5 == 0) {
            return true;
        }
        if (smallCount >= goal) {
            return true;
        }
        return bigCount + smallCount >= goal && goal % 5 <= smallCount;
    }
} 