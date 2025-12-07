package com.sk.FileHandling.FileReader;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo {
    public static void main(String[] args) {
        try {
            String inputPath = "C:\\inputoutput\\input.txt";
            String outputPath = "C:\\inputoutput\\output.txt";
            
            FileReader fr = new FileReader(inputPath);
            FileWriter fw = new FileWriter(outputPath);
            
            int data;
            int sum = 0;
            while ((data = fr.read()) != -1) {
//                sum = sum + data;
//                fw.write(sum);
                fw.write(data);
            }
            
            fr.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

