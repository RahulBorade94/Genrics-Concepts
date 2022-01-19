package com.bridgelabz.genrics;

public class PrintArray {
    public <T extends Comparable<T>> T compareTo(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }


    public static void main(String[] args) {
        PrintArray integerComp = new PrintArray();
        System.out.println("Maximum from 3 Integer Object : "+integerComp.compareTo(30,100,56));
        PrintArray floatComp = new PrintArray();
        System.out.println("Maximum from 3 Float Object : "+floatComp.compareTo(50.0F,20.0F,30.0F));
        PrintArray stringComp = new PrintArray();
        System.out.println("Maximum from 3 String Object : "+stringComp.compareTo("Apple","Peach","Banana"));

    }

}

