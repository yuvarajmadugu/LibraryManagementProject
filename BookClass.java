package com.LiraryManagementSystemProject;

public class Book extends LibraryItem {
    final String author;

    public Book(String itemId, String title, String author){
        super(itemId, title);
        this.author = author;
    }

    @Override
    public void showDetails(){
        System.out.println("Book Title: "+title+"\n Author: "+author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", itemId='" + itemId + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
