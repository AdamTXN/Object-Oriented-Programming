/*
 * Adam Nguyen 1001875475
 */

import java.util.Scanner;

public class input
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter int ");
        int dog = 0;
        dog = in.nextInt(); // object.method
        System.out.println("The value of dog is " + dog);

        System.out.print("Enter Float ");
        double cat = 0.0;
        cat = in.nextDouble();
        System.out.println("Float value is " + cat);

        double num1 = 0.0;
        double num2 = 0.0;
        System.out.print("Enter first num ");
        num1 = in.nextDouble();
        System.out.print("Enter second num ");
        num2 = in.nextDouble();
        System.out.printf("%7.2f\n", num1);
        System.out.printf("+ %5.2f\n", num2);
        System.out.println("-------");
        System.out.printf("%7.2f", num1 + num2);

        System.out.println("Enter name ");
        //String name = in.next();
        String name = in.nextLine();
        //String name = name + " " + in.next();
        //nextLine(); reads until user press ENTER
        int length = name.length(); // strlen
        System.out.println("Name is " + name);
        System.out.println("The name is" + length + "characters long");

        in.close();
    }
}
