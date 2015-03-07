/**
 * Created by c4q-nali on 3/7/15.
 */
import java.util.Scanner;

public class RPNCalculator {
    public static void main (String [] args) {
        int firstNumber, secNumber;
        int answer = 0;
        String operator;
        Scanner input = new Scanner (System.in);

        System.out.println("What is your first number?");
        firstNumber = input.nextInt();
        System.out.println("What is your second number?");
        secNumber = input.nextInt() ;
        System.out.print("Please enter an operator");
        operator = input.next();

        if(operator.equals("+")) {
            answer = firstNumber + secNumber ;
        } else if (operator.equals("-")){
            answer = firstNumber - secNumber ;
        } else if (operator.equals("/")) {
            answer = firstNumber / secNumber ;
        } else if (operator.equals("*")) {
            answer = firstNumber * secNumber ;
        } else if (operator.equals("%")) {
            answer = firstNumber % secNumber ;
        } else {
        System.out.println("That's not an operator.");
        }
        System.out.println("Your answer is " + answer);

        }

    }