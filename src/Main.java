import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Ask user for array dimensions and create the 3D array

        int depth = sc.nextInt();
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][][] arr = new int[depth][rows][columns];

        // TODO: Populate the array with user input

        for(int i = 0; i <= arr.length-1; i++) {
            for(int j = 0; j <= arr[i].length-1; j++) {
                for(int k = 0; k <= arr[i][j].length-1; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // TODO: Calculate and print average of each 3D column

        System.out.println("3D Array: ");
        for(int i = 0; i <= arr.length-1; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for(int j = 0; j <= arr[i].length-1; j++) {
                for(int k = 0; k <= arr[i][j].length-1; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }

//        for(int i = 0; i <= arr.length-1; i++) {
//            float avg;
//            for(int j = 0; j <= arr[i].length-1; j++) {
//                int sum = 0;
//                for(int k = 0; k <= arr[i][j].length-1; k++) {
//                    sum += arr[i][j][k];
//                }
//                avg = sum / columns;
//                System.out.println("Average of column (" + i + "," + j + "): " + avg);
//            }
//        }

        for(int j = 0; j <= rows-1; j++) {
             for(int k = 0; k <= columns-1; k++) {
                float avg;
                int sum = 0;
                for(int i = 0; i <= depth-1; i++) {
                    sum += arr[i][j][k];
                }
                avg = sum / depth;
                System.out.println("Average is : " + avg);
            }
        }
        sc.close();
    }
}