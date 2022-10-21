/**
 *
 * You are given an integer , you have to convert it into a string.
 *
 * Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
 *
 *  can range between  to  inclusive.
 *
 * Sample Input 0
 *
 * 100
 * Sample Output 0
 *
 * Good job
 */

 package com.github.esabook.HackerRankChallenge;

import java.util.*;
import java.security.*;
public class no9_Java_Int_to_String {
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
