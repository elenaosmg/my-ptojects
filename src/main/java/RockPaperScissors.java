import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {


    public static void main (String[] args) {

        //randomised computer input (string array)
        String[] rps = {"r", "p", "s"}; //creating the  arrey list
        String computerMove = rps[new Random().nextInt(rps.length)]; // creating computer move

        //user input
        Scanner scanner = new Scanner(System.in);
        String playerMove;

        while (true) {
            System.out.print("Please enter your move (r,p,s)");
            playerMove = scanner.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                break;
            }

            System.out.println(playerMove + "is not a valid move.");

        }

        System.out.println("Computer played: " + computerMove);

        if (playerMove.equals(computerMove)) {
            System.out.println("The game is a tie!");
        } else if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
                System.out.println("You lose!");
            } else if (computerMove.equals("s")) {
                System.out.println("You win!");
            }
        } else if (playerMove.equals("p")) {
            if (computerMove.equals("s")) {
                System.out.println("You lose!");
            } else if (computerMove.equals("r")) {
                System.out.println("You win!");
            }
        } else if (playerMove.equals("s")) {
            if (computerMove.equals("r")) {
                System.out.println("You lose!");
            } else if (computerMove.equals("p")) {
                System.out.println("You win!");
            }
        }

} }
