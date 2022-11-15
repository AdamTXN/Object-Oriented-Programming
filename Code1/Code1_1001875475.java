/*
 * Adam Nguyen 1001875475 Coding Assignment 1
 */

import java.util.Scanner;

public class Code1_1001875475 
{
    public static String displayMoney(int price)
    {
        String dollars = String.valueOf(price / 100);
        String cents = String.valueOf(price % 100);

        if(cents.compareTo("0") == 0)
            cents = "00";

        return "$" + dollars + "." + cents;
    }

    public static int PencilMenu()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please choose from the following options\n");
        System.out.println("0. No pencils for me today\n1. Purchase pencils\n2. Check inventory level\n3. Check change level\n");
        System.out.print("\nChoice : ");
        int choice = in.nextInt();
        
        while (choice < 0 || choice > 3)
        {
        System.out.println("Invalid menu option\n");
        System.out.println("Please choose from the following options\n");
        System.out.println("0. No pencils for me today\n1. Purchase pencils\n2. Check inventory level\n3. Check change level\n");
        System.out.print("\nChoice : ");
        choice = in.nextInt();
        }

        return choice;
    }

    public static ACTION buyPencils(String change[], int purchaseAMT, int array[], int payment, int price)
    {
        int purchaseCST = purchaseAMT * price;
        ACTION result = ACTION.INSUFFICIENTFUNDS;

        int inventory = array[0];
        int changelvl = array[1];

        if (payment >= purchaseCST)
        {
            if (payment == purchaseCST)
            {
                inventory = inventory - purchaseAMT;
                changelvl = changelvl + purchaseCST;
                result = ACTION.EXACTPAYMENT;
            }
            else if (changelvl > (payment - purchaseCST))
            {
                inventory = inventory - purchaseAMT;
                changelvl = changelvl + purchaseCST;
                change[0] = displayMoney(payment-purchaseCST);
                result = ACTION.DISPENSECHANGE;
            }
            else if (changelvl < (payment - purchaseCST))
            {
                result = ACTION.INSUFFICIENTCHANGE;
            }
        }
        else if (payment < purchaseCST)
        {
            result = ACTION.INSUFFICIENTFUNDS;
        }

        array[0] = inventory;
        array[1] = changelvl;

        return result;
    }

    enum ACTION
    {
        DISPENSECHANGE, INSUFFICIENTCHANGE, INSUFFICIENTFUNDS, EXACTPAYMENT
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final int price = 60;
        int inventory = 100, changelvl = 500, choice = 10;
        int array [] = {inventory, changelvl};
        int purchaseAMT = 0, purchaseCST = 0, payment = 0;

        String change[] = {""};
        
        System.out.println("Welcome to my Pencil Machine\n");

        while(choice != 0)
        {
            choice = PencilMenu();

            switch(choice)
            {
                case 0:
                    break;
                case 1:
                    if(inventory == 0)
                    {
                        System.out.println("\nThis Pencil Dispenser is out of inventory.\n");
                    }
                    else
                    {
                        System.out.printf("\nA pencil costs %s\n", displayMoney(price));
                        System.out.print("How many pencils would you like to purchase? ");
                        purchaseAMT = in.nextInt();

                        while(purchaseAMT <= 0 || purchaseAMT > inventory)
                        {
                            System.out.print("Cannot sell that quantity of pencils. Please reenter quantity ");
                            purchaseAMT = in.nextInt();
                        }

                        purchaseCST = purchaseAMT*price;

                        System.out.printf("\nYour total is %s\n\n", displayMoney(purchaseCST));
                        System.out.print("Enter your payment (in cents) ");
                        payment = in.nextInt();

                        ACTION result = buyPencils(change, purchaseAMT, array, payment, price);
                        inventory = array[0];
                        changelvl = array[1];
                        
                        switch (result)
                        {
                            case DISPENSECHANGE:
                                System.out.print("Here's your pencils and your change of " + change[0] + "\n\n");
                                break;
                            case INSUFFICIENTCHANGE:
                                System.out.println("This Pencil Dispenser does not have enough change and cannot accept\nyour payment.\n");
                                break;
                            case INSUFFICIENTFUNDS:
                                System.out.println("You did not enter a sufficient payment. No pencils for you.\n\n");
                                break;
                            case EXACTPAYMENT:
                                System.out.printf("Here's your pencils. Thank you for exact payment\n\n");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.printf("\nThe current inventory level is %d\n\n", inventory);
                    break;
                case 3:
                    System.out.printf("\nThe current change level is %s\n\n", displayMoney(changelvl));
                    break;
            }

        }
    }
}
