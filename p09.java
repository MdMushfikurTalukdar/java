package noname1;

import java.util.Scanner;

public class p09
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int a = input.nextInt();
        String b = String.valueOf(a);
        if(a == Integer.parseInt(b))
        {
            System.out.println("Good job");
        }
        else
        {
            System.out.println("Wrong answer");
        }
    }
}