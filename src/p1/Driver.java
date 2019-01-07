/**
 * 
 */
package p1;

<<<<<<< HEAD
/*
 * 1) Create deck
 * 2) Shuffle deck
 * 3) Deal Cards
 * 4) Player plays
 *      a) hit
 *      b) stay/bust
 * 5) Dealer plays
 *      a) hit
 *      b) stay/bust
 * 6) See winner
 */
=======
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
>>>>>>> 2fae3095b1f8563eb86bc1540ac9d93e14c8943b

/**
 * Drives the program.
 * @author DDD
 * @version 1.0
 *
 */
public class Driver {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
        int numOfPlayers = 0;
        boolean valid;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("How many players: ");
            try {
                numOfPlayers = scan.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println(e + ": Please enter an integer");
                valid = false;
            }
        } while (!valid);
        
        Deck d = new Deck();
        
        //the first player will be the dealer.
        for (int counter = 0; counter <= numOfPlayers; counter ++) {
            Player newPlayer = new Player();
            newPlayer.hit(d);
            newPlayer.hit(d);
            players.add(new Player());
            System.out.println("Player" + counter + ": \n" + newPlayer);
        }
        
        
        scan.close();
        System.out.println("Game Ended.");
    }

}
