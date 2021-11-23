import java.io.IOException;
import java.util.*;

public class HangManGame {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HangingMan hangingMan = new HangingMan();
        Puzzle puzzle = new Puzzle();
        System.out.println("You must unlock a secret weapon to defeat the Boogieman!\n");

        while (puzzle.isUnsolved() && hangingMan.isntDead()) {
            hangingMan.show();
            puzzle.show();
            System.out.print("\nMake a guess: ");
            String guess = scanner.nextLine().toUpperCase();
            if (!puzzle.makeGuess(guess)) {
                hangingMan.dieSomeMore();
            }
            clearScreen();
        }

        if (hangingMan.isntDead()) {
            hangingMan.victory();
            System.out.println("\n\nYou defeated the Boogieman! Hooray!");
        } else {
            hangingMan.show();
            System.out.println("\n\nThe Boogieman now haunts you forever! The word was " + puzzle.getWord());
        }
    }

    public static void clearScreen() {
        System.out.println("\f");
    }
}
