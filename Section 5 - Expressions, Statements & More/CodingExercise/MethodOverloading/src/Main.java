public class Main {

    public static void main(String[] args) {

        System.out.println("New score is " + calculatingScore("Tim", 500));
        System.out.println("New score is " + calculatingScore(10));
    }

    public static int calculatingScore(String playerName, int score) {

        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculatingScore(int score) {

        return calculatingScore("Anonymous",score);
    }

    public static int calculatingScore() {

        System.out.println("No player name, no player score.");
        return 0;
    }
} 