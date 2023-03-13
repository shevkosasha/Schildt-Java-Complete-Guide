package io;

import java.io.*;

public class SimpleFileReader {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        if (args.length != 1) {
            System.out.println("Invalid arguments");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        }catch (IOException e){
            System.out.println("It's impossible to open the file");
        }

        try {
            do {
                i  =  fin.read() ;
                if ( i != - 1 )
                    System.out.print ( ( char )  i ) ;
            } while ( i != - 1 ) ;
        } catch (IOException e){
            System.out.println("Error reading file");
        }
        try {
            fin.close();
        } catch (IOException e){
            System.out.println("Error closing file");
        }
    }
}
