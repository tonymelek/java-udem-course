import java.util.Scanner;

public class WhileLoops {
    final static String[] choices = { "rock", "paper", "scissors" };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Please, enter a number to reflect your choice 1-rock
        // 2-paper 3-scissors :");
        // int scan1 = scan.nextInt();
        int die1 = 1;
        int die2 = 2;
        int counter = 0;
        while (die1 != die2) {
            die1 = dice();
            die2 = dice();
            System.out.println("die1=" + die1 + ", die2=" + die2);
            counter++;
        }
        System.out.println(counter);

        scan.close();
    }

    private static int dice() {
        return (int) (Math.ceil(Math.random() * 6));
    }
}
