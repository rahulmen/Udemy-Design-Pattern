package com.designPattern.udemy;

import java.util.Scanner;

public class BookTest {

   static Scanner scan = null;

    static{
        scan = new Scanner(System.in);
    }

    public static void main(String... args){

        BookHandler bookHandler = new Book(scan.next(),scan.nextLong());
        bookHandler.print();
        bookHandler.save();
        bookHandler = new Magzine(scan.next(),scan.nextLong());
        bookHandler.print();
        bookHandler.save();

    }


}
