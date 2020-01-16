package com.designPattern.udemy;

public class BookPersistence {

    public void save(Object book){
        if(book instanceof Book){
            Book book1 = (Book)book;
            System.out.println("Book "+book1.getBookName()+" with Page count "+book1.getBookPageNumber()+" is saved");
        }else{
            Magzine magzine = (Magzine)book;
            System.out.println("Magzine "+magzine.getBookName()+" with Page count "+magzine.getBookPageNumber()+" is saved");
        }
    }

    public void print(Object book){

        if(book instanceof Book){
            Book book1 = (Book)book;
            System.out.println(book1.getBookName()+" is printing...");
        }else{
            Magzine magzine = (Magzine)book;
            System.out.println(magzine.getBookName()+" is printing...");
        }

    }

}
