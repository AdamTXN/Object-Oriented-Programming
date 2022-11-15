
import java.util.Scanner;
import java.util.Random;

public class olq3
{

    enum TropicalF
    {
        TETRA, BETTA, BARB;
    }

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Pick num plz ");
        int answer = in.nextInt();
        int rand = rn.nextInt(answer);
        System.out.printf("Random num: %d", rand);


        /*
        System.out.printf("tetra is %s\n betta is %s\n barb is %s", TropicalF.TETRA, TropicalF.BETTA, TropicalF.BARB);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String answer = in.nextLine();

        int start = 0, end = 0;
        System.out.print("Enter start: ");
        start = in.nextInt();
        System.out.print("Enter end: ");
        end = in.nextInt();

        char output = answer.charAt(start);
        String subanswer = answer.substring(start, end);
        System.out.printf("Char at %d", start);
        System.out.print(" is " + output + "\nwith substring " + subanswer);
        */
    }
}

