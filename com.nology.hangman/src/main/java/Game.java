import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Game {
    protected static ArrayList<String> wordsArray = new ArrayList<>();

    protected static Scanner scObj = new Scanner(System.in);

    protected static String userName;

    protected static String result;

    protected static int level;

    private static String start;

    public static void main(String[] args) {
        ConnectUser.registerUser();
        do{
            boolean checkFlag = true;
            level=5;
            int check = ConnectUser.touchInUser();
            if (check == 1) {
                WordStore.getWordArray();
                String randomWord = WordStore.getRandomWord();
                //System.out.println("Random Word = " + randomWord);
                while (!(randomWord.equals(result)) && level>0) {
                    System.out.println("Level = "+level);
                    String checkChar = ConnectUser.displayWord(randomWord, checkFlag);
                    ShowGuess.checkGuess(randomWord, checkChar);
                    checkFlag = false;
                    switch(level){
                        case 0:
                            System.out.print("              +---+\n" +
                                    "                |   |\n" +
                                    "                O   |\n" +
                                    "               /|\\  |\n" +
                                    "               / \\  |\n" +
                                    "                    |\n" +
                                    "              =========");
                            break;
                        case 1:
                            System.out.println(
                                    "                +---+\n" +
                                            "                |   |\n" +
                                            "                O   |\n" +
                                            "               /|\\  |\n" +
                                            "               /    |\n" +
                                            "                    |\n" +
                                            "              =========");
                            break;
                        case 2:
                            System.out.println("              +---+\n" +
                                    "                |   |\n" +
                                    "                O   |\n" +
                                    "               /|\\  |\n" +
                                    "                    |\n" +
                                    "                    |\n" +
                                    "              =========");
                            break;
                        case 3:
                            System.out.println("               +---+\n" +
                                    "                |   |\n" +
                                    "                O   |\n" +
                                    "                |   |\n" +
                                    "                    |\n" +
                                    "                    |\n" +
                                    "              =========");
                            break;
                        case 4:
                            System.out.println("              +---+\n" +
                                    "                |   |\n" +
                                    "                    |\n" +
                                    "                    |\n" +
                                    "                    |\n" +
                                    "                    |\n" +
                                    "              =========");
                    }
                    if(randomWord.equals(result)){
                        System.out.println("\nCongrats "+userName+", You won");
                    }
                }
                if(level<=0){
                    System.out.println("\nRandom word was "+randomWord);
                    System.out.println("\n\nGame Over");
                }
                System.out.println("\nDo you want to play again? Please enter yes for continue or no for exit");
                start = (scObj.nextLine()).toLowerCase();
            }
        } while(start.equals("yes"));

    }

}
