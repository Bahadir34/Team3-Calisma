package questions;

import java.util.Scanner;

public class PalindromeControl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String reverseString = "";


        for (int i = A.length(); i > 0; i--) {
            reverseString += A.substring(i - 1, i);
        }

        if (reverseString.equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(reverseString);
        System.out.println(A);
    }

}
