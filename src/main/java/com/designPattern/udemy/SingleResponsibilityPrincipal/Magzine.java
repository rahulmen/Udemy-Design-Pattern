package com.designPattern.udemy.SingleResponsibilityPrincipal;

public class Magzine implements BookHandler{

    private String bookName;
    private long bookPageNumber;
    private BookPersistence bookPersistence;

    Magzine(String bookName,long bookPageNumber){
        this.bookName=bookName;
        this.bookPageNumber=bookPageNumber;
        this.bookPersistence=new BookPersistence();
    }

    Magzine(){super();}

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public long getBookPageNumber() {
        return bookPageNumber;
    }

    public void setBookPageNumber(int bookPageNumber) {
        this.bookPageNumber = bookPageNumber;
    }

    @Override
    public void print(){
        this.bookPersistence.print(this);
    }

    @Override
    public void save(){
        this.bookPersistence.save(this);
    }

    @Override
    public String toString(){
        return this.bookName+" "+this.bookPageNumber;
    }


}
