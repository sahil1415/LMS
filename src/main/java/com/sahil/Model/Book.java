package com.sahil.Model;

public class Book {
    int book_Id;
    String book_Title;
    String book_Author;
    int book_pages;
    public boolean book_Exist;
    public  int book_Quantity;
    public String borrowed_By;


    public Book(int book_Id, String book_Title, String book_Author, int book_pages, boolean book_Exist, int book_Quantity){
        this.book_Id = book_Id;
        this.book_Title = book_Title;
        this.book_Author = book_Author;
        this.book_pages = book_pages;
        this.book_Exist = book_Exist;
        this.book_Quantity = book_Quantity;
    }

    public int getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(int book_Id) {
        this.book_Id = book_Id;
    }

    public String getBook_Title() {
        return book_Title;
    }

    public void setBook_Title(String book_Title) {
        this.book_Title = book_Title;
    }

    public String getBook_Author() {
        return book_Author;
    }

    public void setBook_Author(String book_Author) {
        this.book_Author = book_Author;
    }

    public int getBook_pages() {
        return book_pages;
    }

    public void setBook_pages(int book_pages) {
        this.book_pages = book_pages;
    }

    public boolean isBook_Available() {
        return book_Exist;
    }

    public void setBook_Available(boolean book_Exist) {
        this.book_Exist = book_Exist;
    }

    public void display_Info(){
        System.out.println("Book Title - " + getBook_Title());
        System.out.println("Book Id - " + getBook_Id());
        System.out.println("Book Author" + getBook_Author());
        System.out.println("Book pages - "+ getBook_pages());
        System.out.println("Book Available - "+ isBook_Available());
        System.out.println("Book Quantity - "+ book_Quantity);
    }
}
