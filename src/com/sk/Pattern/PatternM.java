package com.sk.Pattern;

public class PatternM {
    public static void drawPatternM(int size) {
        // Not optimal code
//        for(int i = 0; i <= size-1; i++){
//            for(int j = 0; j <= size-1; j++) {
//                if(j == 0 || j == size-1 || ((i+j == size-1 || i == j) && i != size-2))
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
        // Optimal Code
        for(int i = 0; i <= size-1; i++){
            for(int j = 0; j <= size-1; j++) {
                if(j == 0 || j == size-1 || (i == j && j <= size/2) || (i+j == size-1 && j >= size/2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int size = 5;
        drawPatternM(size);
    }
}
