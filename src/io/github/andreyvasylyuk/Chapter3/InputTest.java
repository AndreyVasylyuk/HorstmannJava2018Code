package io.github.andreyvasylyuk.Chapter3;

import java.io.Console;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        
        System.out.println("How old are you?");
        int age = in.nextInt();
        
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
        
//        Console cons = System.console();
//        String username = cons.readLine("User name: ");
//        char[] password = cons.readPassword("Password: ");
//        System.out.println("user:"+username+", pass:"+String.valueOf(password));
        in.close();
    }
}
