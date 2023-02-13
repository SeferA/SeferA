import java.util.Scanner;

public class CommandSystem {

    public CommandSystem(Scanner input, String command) {
        switch (command){
            case ".help":
            System.out.println("working...");
             break;
            case ".generate":
            //generatePass();
             break;
            case ".list":
            System.out.println("list...");
             break;
            default:
        }
        
    }
      
}
