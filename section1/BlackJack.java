import java.util.Scanner;

public class BlackJack {
    final static String[] choices = { "rock", "paper", "scissors" };
    private static Scanner scan = new Scanner(System.in);
    private static boolean continueGame = true;

    public static void main(String[] args) {

        int yourCard1 = playingCard();
        int yourCard2 = playingCard();

        int dealerCard1 = playingCard();
        int dealerCard2 = playingCard();

        System.out.println("Your cards are : " + yourCard1 + ", " + yourCard2);
        System.out.println("Dealer card 1 is " + dealerCard1);

        int userTotal = yourCard1 + yourCard2;
        int dealerTotal = dealerCard1 + dealerCard2;

        int userChoice = 0;

        while (continueGame) {
            userChoice = getUserChoice();
            if (userChoice == 2) {
                userTotal += playingCard();
                System.out.println("Now your Total=" + userTotal);
                if (userTotal > 21) {
                    endGame("You lost because you exceeded 21");

                } else if (userTotal == 21) {
                    endGame("You Won!!");

                } else {
                    System.out.println("To continue");
                }
            } else if (userChoice == 1) {
                System.out.println("Dealer total is " + dealerTotal);
                while (dealerTotal <= 17) {
                    dealerTotal += playingCard();
                    System.out.println("Dealer total is " + dealerTotal);
                }
                if (userTotal > dealerTotal || dealerTotal > 21) {
                    endGame("You Won!!");
                } else if (userTotal == dealerTotal) {
                    System.out.println("To continue");
                } else {
                    endGame("Dealer Won!!");
                }

            } else {
                endGame("Invalid choice exiting game");
            }

        }

    }

    private static int playingCard() {
        return (int) (Math.ceil(Math.random() * 13));
    }

    private static int getUserChoice() {
        System.out.println("Please, choose 1 for stay and 2 for hit:");
        int userChoice = scan.nextInt();
        return userChoice;
    }

    private static void endGame(String message) {
        System.out.println(message);
        continueGame = false;
        scan.close();
        System.exit(0);
    }
}
