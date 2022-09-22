package unit1_fundamentals;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loops {
    public static void main(String[] args) {
        int i = 89;
        int j = 1;
        int count = 0;
        Scanner sc = new Scanner(System.in);//take system input as input
        boolean going = true;
        String password = "shark50";

//        Exercise 1
//Write a program which prints numbers from 89 to 117.
        while (i <= 117) {
            System.out.println(i);
            i++;
        }
//        exercise 2 Write a program which prints numbers from 1 to 40. After every third number, print “Quack.”.
        while (j <= 40) {
            if (count == 3) {
                System.out.println("Quark");
                count = 0;
            } else {
                System.out.println(j);
                j++;
                count++;
            }
        }
//        Exercise 3
//Write a program which asks the user for a password. Make the password “shark50”. Each time the user enters the password incorrectly, prompt them for a password again. When the user enters the password correctly, print “ACCESS APPROVED”.

        while (going) {
            System.out.print("Enter password: ");
            String pass = sc.nextLine();
//            System.out.print(pass);
            if (pass.equals(password)) {
                System.out.print("Access Aprroved ");
                going = false;
            }
        }

//        Exercise 5
//Create a game where the program picks a random number from 1 to 100 and the player has to guess it. Each time the player makes a guess, print “HIGHER” if the guess was too low or “LOWER” if the guess was too high. If the player correctly guesses the number, print “CORRECT”, then end the game.
//
//You can use the line of code below which produces a random number from 1 to 100, and stores it in randomNumber.
        int counter = 0;
        boolean guess = true;
        int random = ThreadLocalRandom.current().nextInt(1, 10);

        while(guess){
            System.out.print("Guess the number:  ");
            int num = sc.nextInt();
            if(num == random) {
                counter++;
                guess = false;
                System.out.format("You win!!The number is %d and you have guessed %d time", num, counter);
            } else if (num < random) {
                System.out.print("HIGHER ");
                counter++;
            } else {
                System.out.print("LOWER ");
                counter++;
            }
        }
    }
}
