package com.sk.FileHandling.MarkMangementSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String outputPath = "C:\\Kodnest\\studentpercentage.txt"; // Changed to relative path
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
            
            String[] subjects = {"Kanada", "English", "Hindi", "Math", "Science", "Social"};
            int marks[] = new int[subjects.length];
            float totalMarks = 0;
            for (int i = 0; i <= marks.length - 1; i++) {
                marks[i] = sc.nextInt();
                totalMarks += marks[i];
                bw.write(subjects[i] + ": " + marks[i]);
                bw.newLine();
            }
            float percentageMarks = (totalMarks / 6 );
            
            bw.write("Total Marks: " + totalMarks);
            bw.newLine();
            bw.write("Percentage Marks: " + percentageMarks);
            bw.newLine();
            
            System.out.println("Data written successfully to " + outputPath);
            
        } catch (Exception e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
