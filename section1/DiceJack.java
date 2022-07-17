import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        int dice1 = dice();
        int dice2 = dice();
        int dice3 = dice();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers between 1 and 6 :");
        int scan1 = scan.nextInt();
        int scan2 = scan.nextInt();
        int scan3 = scan.nextInt();

        if (scan1 < 1 || scan2 < 1 || scan3 < 1) {
            System.out.println("Numbers should be greater than 1, Exiting game");
            System.exit(0);
        }
        if (scan1 > 6 || scan2 > 6 || scan3 > 6) {
            System.out.println("Numbers should be less than 7, Exiting game");
            System.exit(0);
        }
        int sumOfRolls = dice1 + dice2 + dice3;
        int sumofUserChoice = scan1 + scan2 + scan3;
        System.out.println("Rolls: " + sumOfRolls + " , User: " + sumofUserChoice + " , Winner: "
                + isUserWinning(sumOfRolls, sumofUserChoice));
        scan.close();
    }

    private static int dice() {
        return (int) (Math.ceil(Math.random() * 6));
    }

    private static boolean isUserWinning(int sumOfRolls, int sumOfChoices) {
        return (sumOfChoices - sumOfRolls < 3 && sumOfChoices > sumOfRolls);
    }
}
