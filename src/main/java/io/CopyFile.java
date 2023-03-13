package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2) {
            System.out.println("Use: file_where_from file_where_to");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i  =  fin.read() ;
                if ( i != - 1 ) fout.write(i);
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
            try {
                if (fout != null) fout.close();
            } catch (IOException e){
                System.out.println("Error closing file");
            }
        }
    }
}
