package com.sahil.Service;

import com.sahil.Database.LibraryDatabase;
import com.sahil.Model.Book;
import com.sahil.Model.Student;

import java.sql.SQLOutput;

public class Borrowing {
    private LibraryDatabase lb;

    public Borrowing(LibraryDatabase lb){
        this.lb = lb;
    }

    public void borrow_Book(int book_Id, String book_Title, Student st){
        for(Book b : lb.getBooks()){
            if(b.getBook_Id() == book_Id && b.getBook_Title().equals(book_Title)){
                if(b.book_Exist){
                    if(b.book_Quantity > 0){
                        b.book_Quantity--;
                        st.has_Borrowed = true;
                        st.borrowed_Book = book_Title;

                        System.out.println("Book borrowed successfully");
                    }
                    else{
                        System.out.println("Book not available");
                    }
                }
                else{
                    System.out.println("Book has been deleted");
                }
            }
        }
    }
    public void return_Book(int book_Id, String book_Title, Student st){
        for(Book b : lb.getBooks()){
            if(b.book_Exist){
                if(b.getBook_Id() == book_Id && b.getBook_Title().equals(book_Title)){
                    b.book_Quantity++;
                    st.has_Borrowed = false;
                    st.borrowed_Book = "Nil";
                    System.out.println("Book Successfully returned");
                }
                else{
                    System.out.println("Book not found");
                }
            }
            else{
                System.out.println("Book has been deleted");
            }
        }
    }

}
