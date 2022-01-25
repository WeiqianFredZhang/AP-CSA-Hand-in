import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        WordPuzzle wordPuzzle = new WordPuzzle();
        System.out.println("==========================================================================\nGuess the 5-letter word in 6 tries!\nEach guess must be a valid 5 letter word. Hit the enter button to submit.\nIf you place a letter in the correct position, the letter will stay there.\nPress enter to start!\n==========================================================================");
        scanner.nextLine();
        while (!wordPuzzle.isSolved() && wordPuzzle.getAttemptCount() <= 6){
            wordPuzzle.show();
            String guess = scanner.nextLine();
            while (guess.length() != 5) {
                System.out.println("Trying to cheat? Guess again.");
                guess = scanner.nextLine();
            }
            while (!wordPuzzle.getAllWords().contains(guess.toUpperCase())) {
                System.out.println("That's not in the word list!");
                guess = scanner.nextLine();
            }
            wordPuzzle.makeGuess(guess.toUpperCase());
            clearScreen();
        }
        if (wordPuzzle.isSolved()){
            wordPuzzle.celebrate();
        } else {
            wordPuzzle.fail();
        }
    }
    public static void clearScreen() {
        System.out.println("\f");
    }
}