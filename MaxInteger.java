package com.number;

import java.util.Scanner;

//public class MaxInteger {
//
//	
//	public static void main(String[] args) {
//		
//		int num1 = 15;
//		int num2 = 6;
//		int num3 = 9;
//		
//		if(num1 >= num2 && num1 >= num3)
//			System.out.println("max num is :" +num1);
//		
//		else if(num2 >= num1 && num2 >= num3)
//		System.out.println("max num is :" +num2);
//		
//		else
//			System.out.println("max num is : " +num3);
//		}
//	}


public class MaxInteger {
    public static void main(String[] args)
    {
        int a,b,c,largest;
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter first  number:");
        a=sc.nextInt();
        System.out.print("Enter second number:");
        b=sc.nextInt();
        System.out.print("Enter third  number:");
        c=sc.nextInt();
         
        if ( a>b && a>c )
            largest=a;
        else if ( b>a && b>c )
            largest=b;
        else
            largest=c;
         
        System.out.println("Largest Number is : "+largest);
         
    }
}