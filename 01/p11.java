package noname1;
import java.util.Scanner;

public class p11 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String A = input.next();
        String B = input.next();
        String D = " ";
        String C = A+B;
        
        int num = C.length();
        
        String E;
        System.out.println(num);
        if(A.length()>B.length())
        {
            System.out.println("No");
        }
        else if(A.length()<B.length())
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        String a = A.substring(0,1);
        String b = A.substring(1);
        String c = a.toUpperCase();
        String d = b.toLowerCase();
        String e = B.substring(0,1);
        String f = B.substring(1);
        String g = e.toUpperCase();
        String h = f.toLowerCase();
        E = c+d+D+g+h;
        System.out.println(E);
    }
    
}
