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


    public static Float compareTo(Float x,Float y,Float z){
        Float max=x;
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
        System.out.println("Maximum from 3 Float Object : "+compareTo(50.0F,20.0F,30.0F));

    }

}

