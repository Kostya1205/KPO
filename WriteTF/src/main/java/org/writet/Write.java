package org.writet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public String WriteToFile(String content){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
                writer.write(content);
                return "Data has been written to the file.";
            } catch (IOException e) {
                e.printStackTrace();
                return e.getMessage();
            }
    }
}