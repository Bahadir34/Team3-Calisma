package questions;

import java.text.ChoiceFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatQuestion
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        double price = scan.nextDouble();

        String myString = NumberFormat.getCurrencyInstance(Locale.US).format(price);

        Locale indianLocale = new Locale("en", "IN");
        String myString1 = NumberFormat.getCurrencyInstance(indianLocale).format(price);

        String myString2 = NumberFormat.getCurrencyInstance(Locale.CHINA).format(price);
        String myString3 = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(price);


        System.out.println("US: " + myString);
        System.out.println("India: " + myString1);
        System.out.println("China: " + myString2);
        System.out.println("France: " + myString3);


    }
}
