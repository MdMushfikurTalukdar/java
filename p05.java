package noname1;
import java.util.Scanner;
import java.lang.Math;

public class p05 
{
    public static void main(String[] args)
    {
        int i,j,x,sum,m,c;
        int[] a = new int[100];
        int[] b = new int[100];
        int[] n = new int[100];
        
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        
        for(i=0; i<x; i++)
        {
            a[i] = input.nextInt();
            b[i] = input.nextInt();
            n[i] = input.nextInt();
            
        }
        for(i=0; i<x; i++)
        {
            sum = a[i];
            m= 0;
            for(j=0; j<n[i] ; j++)
            {
               
                c = (int) Math.pow(2,m);
                sum += (c*b[i]);
                m++;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
    
}
