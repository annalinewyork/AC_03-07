/**
 * Created by c4q-nali on 3/7/15.
 */

import java.util.Scanner;
public class fortuneTeller {
    public static void main (String [] args){
        String respond1,respond2,respond3 ;
        Scanner input = new Scanner (System.in);

        System.out.println("Would you wanna know how is your future husband looks like?");
        respond1 = input.next();
        if (respond1.equals("yes")){
            System.out.println("Ok, your future husband looks like moose");
        }
        System.out.println("Would you wanna know when you gonna have a baby?");
        respond2 = input.next();
        if (respond2.equals("yes")){
            System.out.println("Ok, your baby gonna born in the next year you meet your husband.");
        }
        System.out.println("Would you wanna know when you'll be a grandmother?");
        respond3 = input.next();
        if (respond3.equals("yes")){
            System.out.println("Oh,honey, I don't know either.");
        }
        if (respond1.equals("no")&& respond2.equals("no")&&respond3.equals("no")){
            System.out.println("Ok, Good Luck! You'll come back to me!");
        } else {
            System.out.println("Ok, time for now, $200.00 please~");
        }
    }
}
