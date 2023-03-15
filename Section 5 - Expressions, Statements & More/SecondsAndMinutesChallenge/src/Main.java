public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds) {


        if (seconds < 0) {
            return "Invalid Value";
        }
        int hours = seconds / 3600;
        int secondsRemaining = seconds % 3600;
        int minutes = secondsRemaining / 60;
        int finalSeconds = secondsRemaining % 60;

        return "" + hours + "h " + minutes + "m " + finalSeconds + "s";
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        }
        int minutesToSeconds = minutes * 60;
        return getDurationString(minutesToSeconds + seconds);
    }

} 