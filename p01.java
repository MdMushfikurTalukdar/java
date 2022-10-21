package noname1;

import java.util.Scanner;


public class p01 {

    public static void main(String[] args) 
    {
       Scanner mad = new Scanner(System.in);
       
       int a;
       

           a = mad.nextInt();
           
           if(a>=6 && a<=20)
           {
               if(a%2!=0)
               {
                   System.out.println("Not Weird");
               }
               else
               {
                   System.out.println("Weird");
               }
                   
           }
           else if(a%2!=0)
           {
               System.out.println("Weird");
           }
           else
               
           {
               System.out.println("Not Weird");
           }
       
       
    }
    
}
