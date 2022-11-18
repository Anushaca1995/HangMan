import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordStore extends Game{

    public static void getWordArray(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\Users\\User\\JavaPrograms\\HangMan\\com.nology.hangman\\src\\main\\resources\\practice.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (sc.hasNext())
        {
            String word = sc.next();
            wordsArray.add(word);
        }
    }

    public static String getRandomWord(){
        int randomNum = (int) (Math.random() * 9);
        String randomWord = wordsArray.get(randomNum);
        return randomWord.toUpperCase();
    }
}
