public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature > 24 && temperature < 46;
        } else {
            return temperature > 24 && temperature < 36;
        }
    }
} 