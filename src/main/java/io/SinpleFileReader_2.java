package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SinpleFileReader_2 {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        if (args.length != 1) {
            System.out.println("Invalid arguments");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            do {
                i  =  fin.read() ;
                if ( i != - 1 )
                    System.out.print ( ( char )  i ) ;
            } while ( i != - 1 ) ;
        } catch (FileNotFoundException e) {
            System.out.println("File not found - " + e.getMessage());
        } catch (IOException e){
            System.out.println("IO error: " + e.getMessage());
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e){
                System.out.println("Error closing file");
            }
        }
    }
}

