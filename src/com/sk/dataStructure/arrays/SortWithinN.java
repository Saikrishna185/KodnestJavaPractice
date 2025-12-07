package com.sk.dataStructure.arrays;

public class SortWithinN {
    public static void main(String[] args) {
        int[] arr = {2,0,1,0,0,1,2,1,2,0,1,2};
        int j = 1;
        for(int i = 0; i < arr.length; i++) {

            if(j == arr.length-1){
                break;
            }
            if(arr[j] < arr[i])  {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j++;
        }
        System.out.print("[");
        for (int i:
             arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}
