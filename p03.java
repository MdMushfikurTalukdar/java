package noname1;

import java.util.Scanner;

public class p03
{
    public static void main(String[] argas)
    {
        Scanner input = new Scanner(System.in);
        int i,j,len,len1,len2;
        int[] b = new int[3];
        String[] a = new String[3];
        
        
        for(i=0; i<3; i++)
        {
            a[i] = input.next();
            b[i] = input.nextInt();
        }
        
        System.out.println("================================");
        for(i=0; i<3; i++)
        {
            len = a[i].length();
            for(j=0; j<len; j++)
            {
                System.out.print(a[i].charAt(j));
            }
            for(j=0; j<15-len; j++)
            {
                System.out.print(" ");
            }
            len1=b[i];
            len2=0;
            for(j=0; j<3; j++)
            {
                if(len1>9)
                {
                    len1 = len1/10;
                    len2++;
                }
                
            }
            if(len2==2)
            {
                System.out.println(b[i]);
            }
            else if(len2==1)
            {
                System.out.print("0");
                System.out.println(b[i]);
            }
            else if(len2==0)
            {
                System.out.print("0");
                System.out.print("0");
                System.out.println(b[i]);
            }
           
        }
        System.out.println("================================");
        
        
    }
}