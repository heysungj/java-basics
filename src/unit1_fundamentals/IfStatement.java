package unit1_fundamentals;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//take system input as input
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter Y: ");
        int y = sc.nextInt();

        if (x > y){
            System.out.format("X is %d Y is %d ", x, y);
            System.out.println(" the diff between x and y is " + (x-y) );
        }
        else {
            System.out.println("X is less or equal to Y and the diff between x and y is " + (y-x) );
        }
    }
}
