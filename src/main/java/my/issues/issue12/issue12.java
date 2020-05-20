package my.issues.issue12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class issue12 {
    public static void main(String[] args) {
        int size=0;
        char [] country = new char [50];
        File file = new File("MyStates.txt");
        try {
            FileReader fileReader = new FileReader(file);
            size = fileReader.read(country);
            System.out.println("Size="+size);
            for (char c: country){
                System.out.print(c);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}