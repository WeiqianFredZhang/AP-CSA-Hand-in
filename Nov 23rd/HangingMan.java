public class HangingMan {

    private int numWrongGuesses;
    private String[] HangmanImage = {"                                             ,--,  ,.-.\n" +
            "               ,                   \\,       '-,-`,'-.' | ._\n" +
            "              /|           \\    ,   |\\         }  )/  / `-,',\n" +
            "              [ ,          |\\  /|   | |        /  \\|  |/`  ,`\n",
            "              | |       ,.`  `,` `, | |  _,...(   (      .',\n" +
            "              \\  \\  __ ,-` `  ,  , `/ |,'      Y     (   /_L\\\n" +
            "               \\  \\_\\,``,   ` , ,  /  |         )         _,/\n" +
            "                \\  '  `  ,_ _`_,-,<._.<        /         /\n",
            "                 ', `>.,`  `  `   ,., |_      |         /\n" +
            "                   \\/`  `,   `   ,`  | /__,.-`    _,   `\\\n" +
            "               -,-..\\  _  \\  `  /  ,  / `._) _,-\\`       \\\n" +
            "                \\_,,.) /\\    ` /  / ) (-,, ``    ,        |\n",
            "               ,` )  | \\_\\       '-`  |  `(               \\\n" +
            "              /  /```(   , --, ,' \\   |`<`    ,            |\n" +
            "             /  /_,--`\\   <\\  V /> ,` )<_/)  | \\      _____)\n" +
            "       ,-, ,`   `   (_,\\ \\    |   /) / __/  /   `----`\n",
            "      (-, \\           ) \\ ('_.-._)/ /,`    /\n" +
            "      | /  `          `/ \\\\ V   V, /`     /\n" +
            "   ,--\\(        ,     <_/`\\\\     ||      /\n" +
            "  (   ,``-     \\/|         \\-A.A-`|     /\n",
            " ,>,_ )_,..(    )\\          -,,_-`  _--`\n" +
            "(_ \\|`   _,/_  /  \\_            ,--`\n" +
            " \\( `   <.,../`     `-.._   _,-`"};

    public void show() {
        for(int i=0;i<numWrongGuesses;i++){
            System.out.print(HangmanImage[i]);
        }
    }

    public boolean isntDead() {
        return HangmanImage.length != numWrongGuesses;
    }

    public void dieSomeMore() {
        numWrongGuesses++;
    }

    public void victory() {
        System.out.print("                           ,--.\n" +
                "                          {    }\n" +
                "                          K,   }\n" +
                "                         /  `Y`\n" +
                "                    _   /   /\n" +
                "                   {_'-K.__/\n" +
                "                     `/-.__L._\n" +
                "                     /  ' /`\\_}\n" +
                "                    /  ' /                  \n" +
                "            ____   /  ' /\n" +
                "     ,-'~~~~    ~~/  ' /_\n" +
                "   ,'             ``~~~%%',\n" +
                "  (                     %  Y\n" +
                " {                      %% I\n" +
                "{      -                 %  `.\n" +
                "|       ',                %  )\n" +
                "|        |   ,..__      __. Y\n" +
                "|    .,_./  Y ' / ^Y   J   )|\n" +
                "\\           |' /   |   |   ||\n" +
                " \\          L_/    . _ (_,.'(\n" +
                "  \\,   ,      ^^\"\"' / |      )\n" +
                "    \\_  \\          /,L]     /\n" +
                "      '-_`-,       ` `   ./`\n" +
                "         `-(_            )\n" +
                "             ^^\\..___,.--`");
    }
}
