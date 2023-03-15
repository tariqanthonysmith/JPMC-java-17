public class Main {

    public static void main(String[] args) {

        int playerPosition = calculateHighScorePosition(25);
        displayHighScorePosition("Tariq", playerPosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get into position " + playerPosition +
                " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
} 