
public class Pokerito {
    final static String[] choices = { "rock", "paper", "scissors" };

    public static void main(String[] args) {
        int yourCard = playingCard();
        int computerCard = playingCard();
        System.out.println("Your Card is " + yourCard);
        System.out.println("Computer Card is " + computerCard);
        int yourMatches = 0;
        int computerMatches = 0;
        for (int i = 0; i < 5; i++) {
            int draw = playingCard();
            System.out.println("Draw " + (i + 1) + " is " + draw);
            if (draw == yourCard) {
                yourMatches++;
            }
            if (draw == computerCard) {
                computerMatches++;
            }
        }
        System.out.println("your matches=" + yourMatches + ", computer matches=" + computerMatches);
        if (yourMatches > computerMatches) {
            System.out.println("You Won!");
        } else if (computerMatches > yourMatches) {
            System.out.println("Computer won!!");
        } else {
            System.out.println("It's a draw!!!");
        }

    }

    private static int playingCard() {
        return (int) (Math.ceil(Math.random() * 13));
    }
}
