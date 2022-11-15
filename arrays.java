import java.util.Scanner;
import java.util.Arrays;

public class arrays
{
    public static void main (String[] args)
    {
        //string compare
        Scanner in = new Scanner(System.in);
        String mywords[] = {"","",""};
        String searchword;
        Boolean Foundit = false;

        for (int i=0; i<3; i++)
        {
            System.out.print("Enter a word: ");
            mywords[i] = in.next();

        }

        System.out.print("Enter a search word: ");
        searchword = in.next();

        for (int i=0; i<3; i++)
        {
            //string1 == stirng2 compares memory location
            //mywords[i].equalsIgnoreCase(searchword)
            if(mywords[i].equals(searchword))
                System.out.printf("Found on index %d\ne", i);
                Foundit = true;
        }

        if(Foundit)
            System.out.println("Found it!");
        else
            System.out.println("Didnt find it!");
        

        //String phrases[] = {"","","","",""}; 
        // same as = new String[5];
        //phrases.length outputs size of the array

        //if array is 2D, phrases.length is row size and phrases[0].lenght is column size

        //Arrays.sort(phrases); sorts in alphabetical order
        //numbers.MAX_VALUE and .MIN_VALUE
    } 
}
