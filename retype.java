import java.util.Scanner;

public class retype 
{
    public static void mian (String[] args)
    {
        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text ");
        String phrase = in.nextLine();

        System.out.print("enter delim ");
        String delim = in.nextLine();

        String token[] = phrase.split(delim);

        for(i = 0; i < token.length; i++)
            System.out.println(token);
    }
}
