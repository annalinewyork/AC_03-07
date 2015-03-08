/**
 * Created by c4q-nali on 3/7/15.
 */
import java.util.Scanner;

public class greetings {
    public static void main( String [] args) {
        String answer1;
        String result = " ";
        Scanner input = new Scanner (System.in);

        System.out.println("Did you have a good day today?");
        answer1 = input.next();

        if(answer1.equalsIgnoreCase("yes")){
            result = "Good Luck!";
        } else if (answer1.equalsIgnoreCase("no") ){
            result = "It will be better tomorrow!";
        } else {
            result = "Please input \"Yes\" or \"No\"";
        }

        System.out.println("Ok " + result + ".");
    }
}
