package unit1_fundamentals;

import java.util.Scanner;

public class Section5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?  ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.println();

        int length = name.length();

        System.out.println("You've lived  " + age + "years. In another " + age + " ears you’ll be " + 2*age +" years old");
        System.out.format("Your name is %s and name length is %d", name, length);
    }
}
