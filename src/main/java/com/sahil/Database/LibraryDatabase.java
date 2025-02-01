package com.sahil.Database;

import com.sahil.Model.Admin;
import com.sahil.Model.Book;
import com.sahil.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {
    private ArrayList<Admin> admins;
    private ArrayList<Student> students;
    private ArrayList<Book> books;

    public  LibraryDatabase(){
        this.admins = new ArrayList<>();
        this.students = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public boolean search_Admin(int user_Id){
        for(Admin ad : admins){
            if(user_Id == ad.getUser_Id()){
                return true;
            }
        }
        return  false;
    }
    public Student search_Student(int user_Id){
        for (Student st : students){
            if(user_Id == st.getUser_Id()){
                return st;
            }
        }
        return null;
    }

    public boolean search_Book(int book_Id){
        for (Book bk : books){
            if(book_Id == bk.getBook_Id()){
                return true;
            }
        }
        return false;
    }

    public void add_User(Object user){
        if(user instanceof Admin){
            admins.add((Admin) user);
            System.out.println("User added Successfully");
        }
        else if(user instanceof Student){
            students.add((Student) user);
            System.out.println("User added Successfully");
        }
        else{
            System.out.println("Invalid User Object");
        }
    }

    public void remove_User(Object user){
        if(user instanceof Admin){
            ((Admin) user).user_Exist = false;  // This is called soft delete
            System.out.println("User deleted successfully");
        }
        else if(user instanceof Student){
            ((Student) user).user_Exist = false;
            System.out.println("User deleted successfully");
        }
        else{
            System.out.println("Invalid user object");
        }
    }

    public void add_Book(Book book){
        books.add(book);
        System.out.println("Book added Successfully");
    }

    public void remove_Book(Book book){
        book.book_Exist = false;
        System.out.println("Book removed successfully");
    }

    public void display_Books(){
        for(Book bk : books){
            System.out.println("Book Id - " + bk.getBook_Id());
            System.out.println("Book Title - " + bk.getBook_Title());
            System.out.println("Book Author - "+ bk.getBook_Author());
            System.out.println("Book Quantity - "+ bk.book_Quantity);
        }
    }

    public void display_Students(){
        for(Student st : students){
            System.out.println("Student Id - "+st.getUser_Id());
            System.out.println("Student Name - "+ st.getUser_Name());
            System.out.println("Borrowed Book - "+st.borrowed_Book);
        }
    }

    public void display_Admin(){
        for(Admin ad : admins){
            System.out.println("Admin Id - "+ad.getUser_Id());
            System.out.println("Admin Name - "+ad.getUser_Name());

        }
    }
}
