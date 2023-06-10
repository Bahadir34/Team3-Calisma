package questions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SubstringQustion {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'



            for (int j = 1; j <= s.length() - k; j++)
            {
                if (smallest.charAt(0) != s.substring(j, j + k).charAt(0)) {
                    System.out.println();
                    System.out.println("SMALLEST");
                    System.out.println(s.substring(j, j + k) + " X " + smallest);
                    System.out.println();
                    smallest = s.substring(j, j + k).charAt(0) < smallest.charAt(0) ? s.substring(j, j + k) : smallest;
                }
                else
                {
                    for (int m = 1; m < k; m++)
                    {
                        if (smallest.charAt(m) != s.substring(j, j + k).charAt(m))
                        {
                            System.out.println();
                            System.out.println("SMALLEST");
                            System.out.println(s.substring(j, j + k) + " X " + smallest);
                            System.out.println();
                            smallest = s.substring(j, j + k).charAt(m) < smallest.charAt(m) ? s.substring(j, j + k) : smallest;
                            break;
                        }
                    }


                }
                System.out.println("New Smallest : " + smallest);

                if(largest.charAt(0) != s.substring(j, j + k).charAt(0))
                {
                    System.out.println();
                    System.out.println("LARGEST");
                    System.out.println(s.substring(j, j + k) + " X " + largest);
                    System.out.println();
                    largest = s.substring(j,j+k).charAt(0) > largest.charAt(0) ? s.substring(j,j+k) : largest;
                }

                else
                {
                    for (int m = 1; m < k; m++)
                    {
                        if (largest.charAt(m) != s.substring(j, j + k).charAt(m))
                        {
                            System.out.println();
                            System.out.println("LARGEST");
                            System.out.println(s.substring(j, j + k) + " X " + largest);
                            System.out.println();
                            largest = s.substring(j, j + k).charAt(m) > largest.charAt(m) ? s.substring(j, j + k) : largest;
                            break;
                        }
                    }
                }
                System.out.println("New largest : " + largest);
            }

        return smallest + "\n" + largest;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println("\n" + getSmallestAndLargest(s, k));
    }
}
