package com.sk.FileHandling.DataStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo {
    public static void main(String[] args) {
        try {
            String inputPath = "C:\\inputoutput\\input.txt";
            String outputPath = "C:\\inputoutput\\output.txt";
            
            FileInputStream fis = new FileInputStream(inputPath);
            FileOutputStream fos = new FileOutputStream(outputPath);
            
            int data;
            int sum = 0;
            while ((data = fis.read()) != -1) {
                sum = sum + data;
                fos.write(sum);
//                fos.write(data);
            }
//            System.out.println(sum);
            
            fis.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
