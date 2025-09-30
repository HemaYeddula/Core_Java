package com.corejava.FileHandling;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterExample 
{
    public static void main(String[] args) 
    {
        String path = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\data.txt";
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a float: ");
        float f = scan.nextFloat();
        
        System.out.print("Enter an Integer: ");
        int n = scan.nextInt();
        
        System.out.print("Enter a boolean value: ");
        boolean b = scan.nextBoolean();

        try (PrintWriter writer = new PrintWriter(new FileWriter(path, true))) 
        {  // true = append
            
        	writer.println(f);   // println is better than print (adds newline)
            writer.println(n);
            writer.println(b);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        
        finally 
        {
            scan.close();
        }
    }
}
