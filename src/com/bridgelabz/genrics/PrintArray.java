package com.bridgelabz.genrics;

public class PrintArray {

    public static Integer compareTo(Integer x,Integer y,Integer z){
        Integer max=x;
        if (y.compareTo(max)> 0){
            max=y;
        }
        if (z.compareTo(max)> 0){
            max=z;
        }
              return max;

    }

    public static void main(String[] args) {
        System.out.println("Maximum from 3 Integer Object : "+compareTo(30,100,56));

    }

}

