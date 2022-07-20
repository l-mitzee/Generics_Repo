package com.number;

import java.util.Scanner;

public class MaxFloat {

	public static void main(String[] args)
    {
        float a,b,c,largest;
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter first  number:");
        a=sc.nextFloat();
        System.out.print("Enter second number:");
        b=sc.nextFloat();
        System.out.print("Enter third  number:");
        c=sc.nextFloat();
         
        if ( a>b && a>c )
            largest=a;
        else if ( b>a && b>c )
            largest=b;
        else
            largest=c;
         
        System.out.println("Largest Number is : "+largest);
         
    }
}


