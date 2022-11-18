import java.util.regex.Pattern;

public class ConnectUser extends Game {

    public static void registerUser(){
        System.out.println("\n\n-----------------------------------------" +
                "           Welcome to Hangman           "+"-----------------------------------------");
        System.out.println("\nPlease Enter Your Name\n");
        userName = scObj.nextLine();
        userName = userName.toUpperCase();
    }
    public static int touchInUser(){
        System.out.println("\nHi "+userName+", Are you ready to start your game? \nPlease ENTER to start or type NO for exit");
        String gameStart = scObj.nextLine();
        if (gameStart.toLowerCase()=="no") {
            System.out.println("Exit Game");
            return 0;
        }else{
            return 1;
        }

    }

    public static boolean isAlpha(String checkChar) {
        Pattern p = Pattern.compile("^[a-zA-Z]*$");
        //System.out.println("Is alpha = "+p.matcher(checkChar).find());
        return p.matcher(checkChar).find();
    }
    public static String displayWord(String randomWord, boolean checkFlag){
        String checkChar="";
        if (checkFlag){
            for(int i=0; i<randomWord.length();i++){
                if(result!=null){
                    result+="_";
                } else{
                    result="_";
                }
            }
        }
        System.out.println("\nGuess the word\n"+result);
        do {
            System.out.println("Please enter only one alphabet");
            checkChar = scObj.nextLine();
        } while (checkChar.length()!=1 || !isAlpha(checkChar));
        return checkChar.toUpperCase();
    }

}

