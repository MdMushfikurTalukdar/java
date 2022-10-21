package noname1;
import java.util.Scanner;

public class p04 
{
    public static void main(String[] args)
    {
        int i,n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(i=1; i<=10; i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
    
}
