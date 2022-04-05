import java.util.Random;
import java.util.ArrayList;

public class Puzzle{

    // Get ten rolls

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i = 1; i <= 10; i++){
            randomList.add(rand.nextInt(20) +1);
        }
        return randomList;
    }

    // Get Random Letter
    
    public String getRandomLetter(){
        Random rand = new Random();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for(int i = 0; i < 26; i++){
            // returns character at specified index of string
            // converts index int to string
            alphabet[i] = String.valueOf(letters.charAt(i));
        }
        return alphabet[rand.nextInt(26)];
    }

    // Get password

    public String generatePassword(){
        String password = "";
        for(int i = 0; i < 8; i++){
            password = password + getRandomLetter();
        }
        return password;
    }

    // Get new password set
    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }


}