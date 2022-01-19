package com.bridgelabz.genrics;

public class PrintArray <T extends Comparable<T>>{
    T x,y,z;

    PrintArray(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T compareTo(){
        T max=x;

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }


    public static void main(String[] args) {
        PrintArray <Integer>integerComp = new PrintArray(30,100,56);
        System.out.println("Maximum from 3 Integer Object : "+integerComp.compareTo());
        PrintArray <Float>floatComp = new PrintArray(50.0F,20.0F,30.0F);
        System.out.println("Maximum from 3 Float Object : "+floatComp.compareTo());
        PrintArray <String>stringComp = new PrintArray("Apple","Peach","Banana");
        System.out.println("Maximum from 3 String Object : "+stringComp.compareTo());

    }

}

