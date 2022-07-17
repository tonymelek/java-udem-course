import java.util.Scanner;

public class ForLoops {
    final static String[] choices = { "rock", "paper", "scissors" };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Please, enter a number to reflect your choice 1-rock
        // 2-paper 3-scissors :");
        // int scan1 = scan.nextInt();
        for (int i = 0; i < 20; i++) {
            System.out.println(i + " - " + FizzBuzz(i));
        }
        scan.close();
    }

    private static String FizzBuzz(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return "";
    }

}
