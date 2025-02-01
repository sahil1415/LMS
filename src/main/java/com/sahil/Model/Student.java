package com.sahil.Model;

public class Student extends User{
    public boolean has_Borrowed;
    public String borrowed_Book;

    public Student(int student_Id, String student_Name, boolean student_Exist, boolean has_Borrowed, String borrowed_Book){
        super(student_Id, student_Name, student_Exist);
        this.borrowed_Book = borrowed_Book;
        this.has_Borrowed = has_Borrowed;
    }

//    public boolean isHas_Borrowed() {
//        return has_Borrowed;
//    }
//
//    public void setHas_Borrowed(boolean has_Borrowed) {
//        this.has_Borrowed = has_Borrowed;
//    }
//
//    public String getBorrowed_Book() {
//        return borrowed_Book;
//    }
//
//    public void setBorrowed_Book(String borrowed_Book) {
//        this.borrowed_Book = borrowed_Book;
//    }

    public void display_Info(){
        System.out.println("Student Name - " + getUser_Name());
        System.out.println("Student Id - " + getUser_Id());
//        System.out.println("Borrowed Book - " + getBorrowed_Book());
        System.out.println("Borrowed Book - " + borrowed_Book);
    }
}
