package com.sk.FileHandling.BufferStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo {
    public static void main(String[] args) {
        try {
            String inputPath = "C:\\inputoutput\\input.txt";
            String outputPath = "C:\\inputoutput\\output.txt";
            
            FileReader fr = new FileReader(inputPath);
            FileWriter fw = new FileWriter(outputPath);
            
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
               bw.write(line);
               bw.newLine();
            }
            br.close();
            bw.close();
            fr.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

