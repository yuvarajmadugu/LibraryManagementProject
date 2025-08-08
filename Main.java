package com.LiraryManagementSystemProject;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java123","Java Book","Kathy Sierra");
        Magazine m1 = new Magazine("SwathiWeekly123","Swathi Magazine", 10);

        //Create User
        Student s1 = new Student("Stu6697","Yuvaraj");
        Professor p1 = new Professor("Profes10k", "MalleshSir");
        System.out.println("\n");

        //BorrowItems
        s1.borrow(b1);
        s1.borrow(m1);
        p1.borrow(m1);
        System.out.println("\n");

        //Return Items
        s1.returnItem();
        p1.returnItem();
        System.out.println("\n");

        //Borrowing after returning
        p1.borrow(b1);
        System.out.println("\n");

        //Show Borrowed Items
        s1.showBorrowedItems();
        p1.showBorrowedItems();
        System.out.println("\n");


        Library library = new Library();

        library.removeBook("Java123");
        library.displayDetails();
        System.out.println("\n");

        library.addBook(b1);
        library.displayDetails();
        System.out.println("\n");
    }
}
