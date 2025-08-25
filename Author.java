package com.LiraryManagementSystemProject;

public class Author {
    private String authorName;
    private String biography;
    private int noOfBooksPublished;
    private int age;

    public Author(String authorName, String biography, int noOfBooksPublished, int age){
        this.authorName = authorName;
        this.biography = biography;
        this.noOfBooksPublished = noOfBooksPublished;
        this.age = age;
    }

    //getter and setters:
    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }


    public String getAuthorName() {
        return authorName;
    }



    public int getNoOfBooks() {
        return noOfBooksPublished;
    }

    public void setNoOfBooks(int noOfBooksPublished) {
        this.noOfBooksPublished = noOfBooksPublished;
    }


    public String getAuthorDetails(){
        return authorName+","+biography+","+noOfBooksPublished;
    }
}
