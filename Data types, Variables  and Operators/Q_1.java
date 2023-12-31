//Write a program to illustrate the size or range of various data types.

import java.util.*;

class Q_1
{
    public static void main(String args[])
    {
        System.out.println("Size of int: " + (Integer.SIZE)/8 + " bytes.");
        System.out.println("Size of long: " + (Long.SIZE)/8 + " bytes.");
        System.out.println("Size of char: " + (Character.SIZE)/8 + " bytes.");
        System.out.println("Size of float: " + (Float.SIZE)/8 + " bytes.");
        System.out.println("Size of double: " + (Double.SIZE)/8 + " bytes.");
    }
}