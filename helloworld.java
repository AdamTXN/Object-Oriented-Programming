/*
 * Adam Nguyen 1001875475
 */

 public class helloworld
 {
        public static void PrintArray(int x[])
        {
            for (int i=0; i<10; i++)
            {
                System.out.print(x[i]);
            }
            System.out.println();
        }

        public static void main (String[] args)
        {
            System.out.println("Hello World");
            int x[] = {0,1,2,3,4,5,6,7,8,9};
            PrintArray(x);
            final int number = 15; //final cannot be changed

            double y = 1.2;
            int z = (int)y; //or (int)Math.round(x); rounds up if 5 and up

            //Math.ceil rounds float up
            //Math.floor rounds float down
            /*
             * print for string
             * printf for formatted string
             * println auto \n
             */
        }
 }
