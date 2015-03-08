/**
 * Created by c4q-nali on 3/7/15.
 */
import java.util.Scanner;

public class madLibs {
    public static void main(String [] args){
        String toy, food, book, fruit, weather;
        int number;
        Scanner input = new Scanner (System.in);

        System.out.println("What is your favourite toy?");
        toy = input.nextLine();
        System.out.println("What is your favourite food?");
        food = input.nextLine();
        System.out.println("Which book did you read tonight?");
        book = input.nextLine();
        System.out.println("What fruit did you buy today?");
        fruit = input.nextLine();
        System.out.println("What's the weather today?");
        weather = input.nextLine();
        System.out.println("What is your favourite number?");
        number = input.nextInt();

        System.out.println("Here is your mad lib!!" + "\n"
                          + "Today is a " + weather +"day," + "John bring his " + book + " and " + toy + "\n"
                          + "and he brought " + number +" "+ fruit +" and " + food + ".");
    }
}
