package unit1_fundamentals;
import java.util.Scanner;

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
            if (pass == password) {

                System.out.print("Access Aprroved ");
                going = false;
            }
        }
    }
}
