package com.corejava.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterExample 
{
    public static void main(String[] args) 
    {
        String path = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\data.txt";
        Scanner scan = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(path, true);   // true = append
             BufferedWriter writer2 = new BufferedWriter(writer)) {

            System.out.print("Enter a number: ");
            int n = scan.nextInt();

            writer2.write(String.valueOf(n));
            writer2.newLine();  // optional: move to next line
            writer2.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scan.close();
        }
    }
}
