package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWriterDemo {
    static final String FILE_NAME = "New file.txt";
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter(FILE_NAME);
        writer.write("Hello\nMy\nFriend");
        writer.close();

        FileReader reader = new FileReader(FILE_NAME);
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        reader.close();
    }
}
