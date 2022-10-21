package noname1;
import java.util.Scanner;

public class p07 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int i;
        for(i=0; input.hasNext(); i++)
        {
            String a = input.nextLine();
            System.out.println(i+1+" "+a);
            
        }
        
        
    }
    
}
