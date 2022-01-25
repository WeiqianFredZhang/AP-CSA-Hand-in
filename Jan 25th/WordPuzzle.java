import java.io.*;
import java.util.ArrayList;

public class WordPuzzle {
    private String wordPuzzle, bestGuess;
    private ArrayList<String> allWords, wrongLetters, misplacedLetters;
    private int attemptCount;

    public WordPuzzle() throws IOException {
        FileReader fr = new FileReader("words.txt");
        BufferedReader br = new BufferedReader(fr);
        allWords = new ArrayList<>();
        while ((wordPuzzle = br.readLine()) != null) {
            if (wordPuzzle.length() == 5)
                allWords.add(wordPuzzle.toUpperCase());
        }
        wordPuzzle = allWords.get((int) (Math.random() * allWords.size()));
        wrongLetters = new ArrayList<>();
        misplacedLetters = new ArrayList<>();
        bestGuess = "_ _ _ _ _";
        attemptCount = 1;
    }

    public boolean isSolved() {
        return wordPuzzle.equals(bestGuess.replaceAll("[^a-zA-Z]", ""));
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public ArrayList<String> getAllWords() {
        return allWords;
    }

    public void show() {
        String wrongs = "\n=========================================\nWrong Letters:\t", misplaced = "Misplaced Letters:\t";
        for (String letter : wrongLetters) wrongs += letter + ", ";
        if (wrongs.lastIndexOf(",") != -1)
            System.out.println(wrongs.substring(0, wrongs.lastIndexOf(",")));
        for (String letter : misplacedLetters) misplaced += letter + ", ";
        if (misplaced.lastIndexOf(",") != -1)
            System.out.println(misplaced.substring(0, misplaced.lastIndexOf(",")) + "\n=========================================\n");
        System.out.println("Attempt " + (attemptCount++) + ":\t" + bestGuess);
    }

    public void makeGuess(String guess) {
        String attemptSolve = "";
        for (int i = 0; i < guess.length(); i++) {
            String cur = guess.charAt(i) + "";
            int maxCount = 0, curCount = 0;
            for (int j=0;j<wordPuzzle.length();j++){
                if (wordPuzzle.charAt(j) == guess.charAt(i)){
                    maxCount++;
                }
            }
            for (int j = 0; j < misplacedLetters.size(); j++) {
                if (misplacedLetters.get(j).equals(cur)) {
                    curCount++;
                }
            }
            if (guess.charAt(i) == wordPuzzle.charAt(i)) {
                attemptSolve += cur + " ";
            } else {
                if (!wordPuzzle.contains(cur)) {
                    if (!wrongLetters.contains(cur))
                        wrongLetters.add(guess.charAt(i) + "");
                } else if (curCount < maxCount) {
                    misplacedLetters.add(guess.charAt(i) + "");
                }
                attemptSolve += "_ ";
            }
        }
        if (attemptSolve.replaceAll("[^a-zA-Z]", "").length() > bestGuess.replaceAll("[^a-zA-Z]", "").length()) {
            bestGuess = attemptSolve;
        }
    }

    public String getWord() {
        return wordPuzzle.replaceAll(" ", "");
    }

    public void celebrate() {
        System.out.println("\n                                   .''.\n" +
                "       .''.      .        *''*    :_\\/_:     .\n" +
                "      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
                "  .''.: /\\ :    /)\\   ':'* /\\ *  : '..'.  -=:o:=-\n" +
                " :_\\/_:'.:::.  | ' *''*    * '.\\'/.'_\\(/_ '.':'.'\n" +
                " : /\\ : :::::  =  *_\\/_*     -= o =- /)\\     '  *\n" +
                "  '..'  ':::' === * /\\ *     .'/.\\'.  ' ._____\n" +
                "      *        |   *..*         :       |.   |' .---\"|\n" +
                "        *      |     _           .--'|  ||   | _|    |\n" +
                "        *      |  .-'|       __  |   |  |    ||      |\n" +
                "     .-----.   |  |' |  ||  |  | |   |  |    ||      |\n" +
                " ___'       ' /\"\\ |  '-.\"\".    '-'   '-.'    '`      |____\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "   ~-~~-~              ~-~-~-~-~-~-~-~-~-~   /|\n" +
                "    ~~-~~        ~-~-~-~-~-~-~-~  /|        /_|\\  ~~-~-~\n" +
                "~-~-~-~-~       -~-~-~-~-~-~     /_|\\      ======\n" +
                "   ~-~-~-           ~-~-~-~     /__|_\\ ~-~-~-~\n" +
                "~-~-~-~-~-~    ~-~~-~-~-~-~    ========  ~-~-~-~\n" +
                "      ~-~~-~-~-~-~-~-~-~-~-~-~-~ ~-~~-~-~-~-~\n" +
                "    ~-~~-~-~-~-~         ~-~~-~-~-~-~\n\nCongratulations! You guessed the word correctly! ＼(＾O＾)／");
    }

    public void fail() {
        System.out.println("\n                      &&&%                                                                   \n" +
                "                    &&&&&&&            #&&&&#                                                \n" +
                "                   %&&%&&&&%         (&&&&&&&                                                \n" +
                "                  &&&&& %&&&(       &&&&&&&&&                                                \n" +
                "                 .&&&&&&&&&&&      (&&&&&&&& &%&&&                                           \n" +
                "                 &&&&&&&&&&&&%     &&&&&&&&* &%&&#                                           \n" +
                "                 &&&&&&&&&&&&&    %&&&&&&&&                &&&&&&&.         #&&&&&&.         \n" +
                "                #&&&&&&&&&&&&&&   &&&&&&&%  /%&&&%      &&&&&&&%%&&      %&&&&&&&&&&&%       \n" +
                "                &&&&&&&&&&&&&&&  &&&&&&&%  %&&&&&&&   ,%&&&/&&&&&&     /&&&&*/%&&&&&&&,      \n" +
                "                &&&&&&&&&&&&&&&& %&&&&&&%  &&% *&&&  ,&&&&&&&&&       (&&&&&&&&&&&&&&&       \n" +
                "               #&&&&&&/ &&& &&&&/&&&&&&%   &&&&&&&&  &&&%&&%          &&&&&&# (&&&&&&#       \n" +
                "   &&&&&&&    &&&&&&&&  %&&&%&&&&&& /&&%   &&&&&&&&  %&%(&&          #&&&&&& &&&%&&&   #&&   \n" +
                "  /&&&&&&&&&&&&&, &&&   *&&&&&&&&&&&&&&    %&&%&&&&  &&&&&&*    &&%  &&&&&&&&&&&&&   &&&&&&. \n" +
                "   &&&(  &&&&&&&&&&&*    &&&&&&&&&&&&&&    #&&&&&&&, %&&&&&&&&&&&&&& .&&% /&&&&   #&&&&&&&%  \n" +
                "    &&&&&&&&&&&&&&&%     /&&&&&&&&&&&&      %&&&&&&,  %&&&%&&&&&&. &  .&&&&&&&&&&&&&.&&&%(   \n" +
                "     %&&&&&&  &&&&.       &&&&   &&&&&      %&&&&&&     %&&&&&&&&%      %&&&&( &&&&&&&&.     \n" +
                "       #%&&&&&&%&          %%%%&&%#%%         %%.                          (&&&&&&&&         \n" +
                "                            /#&&%#%&        /#%%&&.          %%        #%&%,                 \n" +
                "                                        &&&&&&% &&&&&&     &&&&&&     #&&&&&&&%              \n" +
                "                          #&&&&&&&&&%  .&&&&&&%%&&&&&&&   &&&&&&&%    &&&# &&&&#             \n" +
                "               ,&&&&&&&&&&&&&&&&&&&&&( (&&&&&&  .&&& #&&  &&&&&&&&    &&&&&&&&&%             \n" +
                "              &&&&&&&&&&&& *&&&&%%&&   /&&&&&&   &&&&&&&   &&&&&&&&  .&&&&&&&&&              \n" +
                "              &&&&&%&&&&&&&&&&&%,      ,&&&&&&/(&&&&&&&%   .&&&# %&&.&&%%&&&&&%              \n" +
                "               %&&&&%# %&&&&&&&         &&&&&&&&&  &&&&      &&&&&&&&&&&&&&&&(               \n" +
                "                       *&&& &&&         &&&&&&&&&&&&&*         &&&&&&,&&&&%%                 \n" +
                "                        &&&&&&&%        &&&&/ %&&&&%             ,%&&&&&&/                   \n" +
                "                        &&&&&&&&        &&&&&&&&&&&&&&&           /&&&&&&&                   \n" +
                "                        %&&&&&&&        &&&&&&&&&&&&&&&&&&%        %&# &&&                   \n" +
                "                         &&* &&&,       &&&&&&% .&&&&&&&&&&&%%     &&&&&&&                   \n" +
                "                         %&&&&&&&       &&&& &&    &&&&&%  &&&     &&%&%&&%                  \n" +
                "                         %&&&&&&        *&&&&&       .&&&&&&%      &&&&&&&                   \n" +
                "                                                                    %&&&\n\nThe word was " + getWord());
    }
}