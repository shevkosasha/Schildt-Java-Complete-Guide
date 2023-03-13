package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharReader {
//    puЫi c stati c void main ( String args [ ] ) throws IOExcept ion
//    {
//    }
//    char с ;
//    Buf feredReader br  =  new BufferedReader ( new
//                                                InputStreamReader ( System . in ) ) ;
//System . out . println ( " Bвeдитe символы ,
//        ' q ' - для выхода . " ) ;  1 1 читать символы
//            do {
//        с  =  ( char ) br . read ( ) ;
//        System . out . println ( c ) ;
//    } whi l e ( c ! = ' q ' ) ;
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter q to quit");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
