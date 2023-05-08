package questions;

import java.util.Scanner;

public class HasNextUsing
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(scan.hasNext())
        {
            String input = scan.nextLine();
            System.out.println(i + " " + input);
            i++;
        }


    }
}
