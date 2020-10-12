package io.github.andreyvasylyuk.Chapter3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class InputFromFileLearning {
    public static void main(String[] args) {
        String homeDir = System.getProperty("user.dir"); //home directory for this .java file
        System.out.println(homeDir);
        
        Scanner in = null;
        try {
            in = new Scanner(Path.of("myFile.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println(in); // which method to use??
    }
}
