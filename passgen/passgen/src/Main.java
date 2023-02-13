import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static String setOfCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmonprstuvwxyz123456789?#$%&()=*-/@";


    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter the command: (If you are first experience .help)");
        new CommandSystem(new Scanner(System.in), new Scanner(System.in).nextLine());
    }

    /**
     * @return full password 
     * @param memberPass this one char instance of full password 
     */
    public static void generatePass() {
       for(int i = 1; i < 9; i++){
        Random random = new Random();
        int randomInt = random.nextInt(setOfCharacters.length());
        char randomChar = setOfCharacters.charAt(randomInt);
        System.out.println(randomChar);

       } 

    }

}
