package questions;

import java.io.*;
import java.time.LocalDate;

public class JavaDateAndTime
{

    public static String findDay(int month, int day, int year)
    {
        LocalDate date = LocalDate.of(year,month,day);
        return String.valueOf(date.getDayOfWeek());
    }


    public static void main(String[] args)
    {
        LocalDate date = LocalDate.of(2017,8,14);

        System.out.println(date.getDayOfWeek());
    }

}
