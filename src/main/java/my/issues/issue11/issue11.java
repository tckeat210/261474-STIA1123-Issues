package com.Goldenclass;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File123 {

    public static void main(String[] args) {
        File file = new File("MyStates.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Kedah\n");
            fileWriter.write("Perlis\n");
            fileWriter.write("Pulau Pinang\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Finish");


    }
}
