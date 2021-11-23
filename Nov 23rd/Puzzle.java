import java.io.*;
import java.util.Arrays;

public class Puzzle {
    private String word, guesses = "";
    private StringBuilder wordBuilder;

    public Puzzle() throws IOException {
        FileReader fr = new FileReader("words.txt");
        BufferedReader br = new BufferedReader(fr);
        int random = (int) (Math.random() * 45402), i = 0;
        while (i < random && (word = br.readLine()) != null) {
            i++;
        }
        assert word != null;
        word = word.toUpperCase();
        int fixedLength = word.length();

        for (i = 0; i < fixedLength; i++) {
            word = word.substring(0,i*2) + " " + word.substring(i*2);
        }
        wordBuilder = new StringBuilder(word.replaceAll("[a-zA-Z]","_"));
    }

    public boolean isUnsolved() {
        return !(wordBuilder.toString().equals(word));
    }

    public void show() {
        System.out.println("Puzzle: " + wordBuilder.toString());
        if (guesses.length() == 0)
            System.out.print("\nYour Guesses: ");
        else
            System.out.print("\nYour Guesses: " + guesses.substring(0, guesses.length() - 2));
    }

    public boolean makeGuess(String guess) {
        guesses += guess + ", ";
        int found = word.indexOf(guess);
        if (found >= 0) {
            wordBuilder.replace(found, found + 1, guess);
            while ((found = word.indexOf(guess, found + 1)) != -1) {
                wordBuilder.replace(found, found + 1, guess);
            }
            return true;
        }
        return false;
    }

    public String getWord() {
        return word.replaceAll(" ","");
    }
}
