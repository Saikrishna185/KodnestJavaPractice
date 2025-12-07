package com.sk.Pattern;

public class CrownPattern {
    // function to print crown pattern
    public static void crown(int length, int height)
    {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < length; j++) {
                if(i == 0 ){
                    if(j == 0 || j == height || j == length-1) {
                            System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                } else if (i == height-1) {
                    System.out.print("*");
                } else if ((j < i || j > height - i) && (j < height + i || j >= length - i)) {
                    System.out.print("|");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main (String[] args)
    {
        // length of crown
        int length = 13;
        
        // height of crown
        int height = (length - 1) / 2;
        
        // function calling
        crown(length, height);
        
    }
}
