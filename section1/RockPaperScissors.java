import java.util.Scanner;

public class RockPaperScissors {
    final static String[] choices = { "rock", "paper", "scissors" };

    public static void main(String[] args) {
        // int dice1 = dice();
        // int dice2 = dice();
        // int dice3 = dice();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter a number to reflect your choice 1-rock 2-paper 3-scissors  :");
        int scan1 = scan.nextInt();

        if (scan1 < 1 || scan1 > 3) {
            System.out.println("Numbers should be between 1 and 3, Exiting game");
            System.exit(0);
        }
        String userChoice = choices[scan1 - 1];
        String computerChoice = computerPlay();

        System.out.println("userChoice: " + userChoice + " , computerChoice: " + computerChoice + ", Winner: "
                + isUserWinning(userChoice, computerChoice));
        scan.close();
    }

    private static String computerPlay() {
        int randomIndex = (int) (Math.random() * 3);
        return choices[randomIndex];
    }

    private static boolean isUserWinning(String userChoice, String computerChoice) {
        boolean result = false;
        if ((userChoice == "scissors" && computerChoice == "paper")
                || (userChoice == "paper" && computerChoice == "rock")
                || (userChoice == "rock" && computerChoice == "scissors")) {
            result = true;
        }
        return result;
    }
}
