import java.util.ArrayList;

public class ShowGuess extends Game{

    public static boolean checkGuess(String randomWord, String checkChar){
        boolean checkLevel = false;
        if (randomWord.contains(checkChar) && !(result.contains(checkChar))){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < randomWord.length(); i++){
                if(randomWord.charAt(i) == checkChar.charAt(0)){
                    list.add(i);
                }
            }
            for (Integer n : list) {
                result=result.substring(0, n) + checkChar + result.substring(n + 1);
                System.out.println(result);
            }
        } else {
            checkLevel = true;
            level--;
            System.out.println("No match");
        }
        return checkLevel;
    }
}
