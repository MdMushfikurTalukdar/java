package noname1;
import java.util.Scanner;

public class p14 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String A = input.next();
        
        String B = new StringBuffer(A).reverse().toString();
        
        if(A.equals(B))
        {
            System.out.println("Yes");
            
        }
        else
        {
            System.out.println("No");
        }
       
        
    }
    
}
