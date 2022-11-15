//package olq4; 
 
import java.util.Scanner; 
 
public class OLQ4 
{ 
   public static void main(String[] args) 
   {
    int i = 0;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a phrase ");
    String phrase = in.nextLine();

    System.out.print("Enter delimiter ");
    String delim = in.nextLine();

    String tokens[] = phrase.split("\\|");

    for(i = 0; i < tokens.length; i++)
    {
        System.out.println(tokens[i]);
    }

   } 
} 
