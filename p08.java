package noname1;
import java.util.Scanner;

public class p08 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        
        int a = input.nextInt();
        int b = input.nextInt();
        int count=0;
        if(a<=0)
        {
            count++;
                
        }
        if(b<=0)
        {
            count++;
        }
        if(count!=0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else
        {
            System.out.print(a*b);
            
        }
        
    }
}
