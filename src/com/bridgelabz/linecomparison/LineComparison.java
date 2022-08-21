package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        int x1,y1,x2,y2;
        double lengthOfline;
        double lengthOfline1, lengthOfline2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Computation");
        x1 = 2;
        y1 = 2;
        x2 = 5;
        y2 = 5;
        System.out.println(" enter values for x1,y1 and x2,y2 of line 1");
        lengthOfline1=getLength(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt());
        System.out.println(" enter values for x1,y1 and x2,y2 of line 1");
        lengthOfline2=getLength(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt());
        System.out.println("Length of line1 = "+lengthOfline1);
        System.out.println("Length of line2 = "+lengthOfline2);
        if (lengthOfline1 == lengthOfline2) {
            System.out.println("Lines are equal");
        }
        else
        {
            System.out.println("Lines are not equal");
    }
        lengthOfline=(Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ));
        System.out.println("Length of line = "+lengthOfline);
        static double getLength(double x1, double y1, double x2, double y2);{
            return ( Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ) );
        }

    }
}
