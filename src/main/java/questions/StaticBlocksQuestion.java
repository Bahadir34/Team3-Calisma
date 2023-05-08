package questions;

import java.util.Scanner;




public class StaticBlocksQuestion
{
    static Scanner scan = new Scanner(System.in);
    static int B;
    static int H ;
    static boolean flag;



    static
    {
        flag = true;
        B = scan.nextInt();
        H = scan.nextInt();

        if(B < 0 || H < 0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args)
    {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
