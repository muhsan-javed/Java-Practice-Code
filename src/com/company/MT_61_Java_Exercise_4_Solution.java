package com.company;

class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* "+ book);
        }
    }

    void issueBook(String book){
        for (int i=0; i<this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!" + book);
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The Book does not exist ");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class MT_61_Java_Exercise_4_Solution {
    public static void main(String[] args) {
        // You have to implement a library using java Class Library
        // Method: addBook, issueBook, returnBook, showAvailableBooks,
        // Properties: Array to store the available book,
        // Array to store h issue books

        Library centrallibrary = new Library();
        centrallibrary.addBook("Android Studio");
        centrallibrary.addBook("C#");
        centrallibrary.addBook("WinForm in C#");
        centrallibrary.addBook("C++");
        centrallibrary.addBook("Java");
        centrallibrary.showAvailableBooks();

        centrallibrary.issueBook("C++");
        centrallibrary.showAvailableBooks();
        centrallibrary.returnBook("C++");
        centrallibrary.showAvailableBooks();
    }
}
