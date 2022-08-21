package com.bridgelabz.linecomparison;


public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Length of line1 = "+lengthOfline1);
        System.out.println("Length of line2 = "+lengthOfline2);

        if (lengthOfline1 == lengthOfline2) {
            System.out.println("Lines are equal");
            Integer l1 = new Integer((int) lengthOfline1);
            Integer l2 = new Integer((int) lengthOfline2);

            if (l1.compareTo(l2) > 0) {
                System.out.println("line 1 is greater than line 2");
            }else if (l1.compareTo(l2) < 0) {
                System.out.println("line 1 is smaller than line 2");
            }else
                System.out.println("Lines are not equal");
            System.out.println("both Lines are equal");
        }

        static double getLength(double x1, double y1, double x2, double y2);{

        }




    }
}
