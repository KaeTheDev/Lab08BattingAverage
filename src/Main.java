import java.util.Scanner;

import static java.lang.Math.pow;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int numAtBats;
        String answer = "";

        System.out.println("Welcome to Batting Average Calculator!");
        System.out.println();

        do{
            System.out.print("Enter number of times at bat: ");
            numAtBats = scan.nextInt();
            scan.nextLine();
            CalcBats(numAtBats);

            System.out.println();
            System.out.print("Another batter? (Yes/No): ");
            answer = scan.next();
        } while(answer.equalsIgnoreCase("yes"));
    }


    //METHODS

    public static void CalcBats(int b)
    {
        Scanner scan = new Scanner(System.in);
        int [] atBatNumbers = new int[b];
        int total = 0;
        int batCount = 0;

        System.out.println();
        System.out.println("0 = Out, 1 = Single, 2 = Double, 3 = Triple, 4 = Home Run");
        for(int i = 0; i < atBatNumbers.length; i++)
        {
            System.out.print("Result for at-bat " + i + ": ");
            atBatNumbers[i] = scan.nextInt();

            do {
                if((atBatNumbers[i] < 0) || (atBatNumbers[i] > 4))
                {
                    System.out.print("Please enter a number between 0-4: ");
                    atBatNumbers[i] = scan.nextInt();
                }
            } while(i < 0 || i > 4);

            total = total + atBatNumbers[i];

            if(atBatNumbers[i] > 0)
            {
                batCount++;
            }
        } //END OF FOR

        batOutPut(total, batCount, b);
    }//END OF 1ST METHOD



    public static void batOutPut(int t, int bc, int nb)
    {
        double batAvg;
        double slugPrcnt;

        batAvg = (double)bc / nb;
        slugPrcnt = (double)t / nb;

        System.out.println();
        System.out.printf("Batting Average: %.3f", batAvg);
        System.out.println();
        System.out.printf("Slugging Percentage: %.3f", slugPrcnt);
        System.out.println();

    } //END OF 2ND METHOD
} // END OF MAIN CLASS


