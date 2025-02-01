package com.sahil;

import com.sahil.Database.LibraryDatabase;
import com.sahil.Model.Admin;
import com.sahil.Model.Book;
import com.sahil.Model.Student;
import com.sahil.Service.Borrowing;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Launch {
    public static void main(String[] args){
        LibraryDatabase db = new LibraryDatabase();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Welcome to Library Management System");
            System.out.println("Enter your Choices");
            System.out.println("1 -> Enter a User");
            System.out.println("2 -> Add a book");
            System.out.println("3 -> Borrow a book");
            System.out.println("4 -> Return a book");
            System.out.println("5 -> Display Books");
            System.out.println("6 -> Display Students");
            System.out.println("7 -> Display Admin");
            System.out.println("8 -> Exit");

            int n = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            switch (n){
                case 1:
                    System.out.println("Enter user details - ");
                    System.out.println("Enter Id - ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume leftover newline
                    System.out.println("Enter Name - ");
                    String name = sc.nextLine();
                    System.out.println("Enter role - ");
                    String role = sc.nextLine();
                    if(role.equals("Student")){
                        Student st = new Student(id, name, true, false, "Nil");
                        db.add_User(st);
                    }
                    else if(role.equals("Admin")){
                        Admin ad = new Admin(id, name, true);
                        db.add_User(ad);  // Add admin to the database
                    }
                    else{
                        System.out.println("Invalid role entered");
                    }
                    break;  // Add break to avoid falling through

                case 2:
                    System.out.println("Enter book details - ");
                    System.out.println("Enter Id - ");
                    int book_id = sc.nextInt();
                    sc.nextLine(); // Consume leftover newline
                    System.out.println("Enter title - ");
                    String book_name = sc.nextLine();
                    System.out.println("Enter Author - ");
                    String author = sc.nextLine();
                    System.out.println("Enter no of pages - ");
                    int pages = sc.nextInt();
                    System.out.println("Enter Quantity - ");
                    int qt = sc.nextInt();

                    Book bk = new Book(book_id, book_name, author, pages, true, qt);
                    db.add_Book(bk);  // Add book to the database
                    break;  // Add break to avoid falling through

                case 3:
                    System.out.println("Enter Book Id - ");
                    int b_id = sc.nextInt();
                    sc.nextLine(); // Consume leftover newline
                    System.out.println("Enter Book title - ");
                    String b_title = sc.nextLine();
                    System.out.println("Enter Student Id - ");
                    int s_id = sc.nextInt();
                    sc.nextLine(); // Consume leftover newline
                    System.out.println("Enter Student Name - ");
                    String s_nam = sc.nextLine();
                    System.out.println();

                    Borrowing br = new Borrowing(db);
                    Student st = db.search_Student(s_id);

                    if(st != null){
                        br.borrow_Book(b_id, b_title, st);
                    } else {
                        Student s1 = new Student(s_id, s_nam, true, true, b_title);
                        db.add_User(s1);
                        br.borrow_Book(b_id, b_title, s1);
                    }
                    break;  // Add break to avoid falling through

                case 4:
                    System.out.println("Enter Book details - ");
                    System.out.println("Enter book id - ");
                    int bbb_id = sc.nextInt();
                    sc.nextLine(); // Consume leftover newline
                    System.out.println("Enter book title - ");
                    String bb_title = sc.nextLine();
                    System.out.println("Enter Student name - ");
                    String ss_name = sc.nextLine();
                    System.out.println("Enter Student id - ");
                    int ss_id = sc.nextInt();

                    Borrowing brr = new Borrowing(db);
                    Student st1 = db.search_Student(ss_id);
                    if(st1 == null){
                        System.out.println("Student record not found");
                    }
                    else{
                        brr.return_Book(bbb_id, bb_title, st1);
                    }
                    break;  // Add break to avoid falling through

                case 5:
                    System.out.println("Book Information - ");
                    db.display_Books();
                case 6:
                    System.out.println("Student Information - ");
                    db.display_Students();
                case 7:
                    System.out.println("Admin Information - ");
                    db.display_Admin();
                case 8:
                    System.out.println("Exited Library Successfully");
                    return;  // Exit the program

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}
