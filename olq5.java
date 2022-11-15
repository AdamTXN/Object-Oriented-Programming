import java.util.ArrayList;
import java.util.Arrays;

public class olq5
{
    public static void main(String[] args)
    {
        ArrayList<Integer> Prime = new ArrayList<>();
        Prime.add(113);
        //System.out.println(Prime);
        Prime.add(1,22);
        //System.out.println(Prime);
        Prime.add(1,21);
        //System.out.println(Prime);
        Prime.add(0,0);
        //System.out.println(Prime);
        Prime.remove(0);
        //System.out.println(Prime);
        Prime.set(1, Prime.get(2) + Prime.get(0));
        System.out.println(Prime);

        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Yellow");
        System.out.println(Colors);
        Colors.add("blue");
        System.out.println(Colors);
        Colors.add("Violet");
        System.out.println(Colors);
        Colors.add(3,"Pink");
        System.out.println(Colors);
        Colors.remove(0);
        System.out.println(Colors);
        Colors.set(0, "Magenta");
        System.out.println(Colors);

        String S1 = "The quick brown fox jumps";
        String S2 = " over the lazy dog";
        System.out.printf("%c", S1.charAt(22));
        System.out.printf("%c", S2.charAt(12));
        System.out.printf("%s", S2.substring(15,18));
        System.out.printf("%c", S1.charAt(14));
        System.out.printf("%s", S1.substring(11,17));
        System.out.printf("%c", S1.charAt(2));

    }
}
