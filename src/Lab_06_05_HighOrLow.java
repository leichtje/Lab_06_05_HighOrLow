import java.util.Random;
import java.util.Scanner;

public class Lab_06_05_HighOrLow {
    public static void main(String[] args) {

        String trash;
        int userGuess;
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;


        Scanner in = new Scanner(System.in);

        System.out.println("What do you think the number is?[1-10]");
        if (in.hasNextInt()) {
            userGuess = in.nextInt();
            in.nextLine();

            if (userGuess >= 1 && userGuess <= 10) {

                System.out.println("The random variable is: " + val);

                if (userGuess == val) {
                    System.out.println("Your guess was on the money!!");
                } else if (userGuess < val) {
                    System.out.println("Your guess was lower than the number.");
                } else if (userGuess > val) {
                    System.out.println("Your guess was higher than the number.");
                } else {
                    trash = in.nextLine();
                    System.out.println("You entered a invalid number: " + trash + " Please try again.");
                    System.exit(0);
                }
            } else {
                System.out.println("You entered a invalid number: " + userGuess + " Please try again.");
                System.exit(0);
            }

        } else {
            trash = in.nextLine();
            System.out.println("You entered a invalid number: " + trash + " Please try again.");
            System.exit(0);
        }


    }

}
