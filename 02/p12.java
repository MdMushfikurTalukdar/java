package noname1;
import java.util.Scanner;

public class p12 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int a = input.nextInt();
        int b = input.nextInt();
        
        String str1 = str.substring(a, b);
        System.out.println(str1);
    }
    
}
