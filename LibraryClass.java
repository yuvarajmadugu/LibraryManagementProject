package com.LiraryManagementSystemProject;

public class Library implements BookOperations{
    private Book[] books= new Book[10];
    int bookcount=0;

    public void addBook(Book book){
        if(bookcount < books.length){
            books[bookcount++] = book;
            System.out.println("Book has been added: "+book);
        }else {
            System.out.println("Library is full, you can not add more books.");
        }
    }

    public void removeBook(String itemID){
        for(int i=0; i<bookcount; i++) {
            if (books[i].getItemId().equals(itemID)) {
                books[i] = books[--bookcount];
                // book would be added at 3 = 0,1,2 which is an array
                books[bookcount] = null;
                System.out.println("Book with itemID: " + itemID + " has been deleted sucessfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayDetails() {
        for (int i = 0; i < bookcount; i++) {
            System.out.println("\n List of books in Library: ");
            System.out.println(books[i].toString());
        }
    }
}
