package com.LiraryManagementSystemProject;

public class Student extends User{

    public Student(String userID, String name){
        super(userID, name);
    }

    @Override
    public void borrow(LibraryItem item){ //instanceof Book Magazine
        if(item instanceof Book){
            super.borrow(item);
        }else {
            System.out.println("Student can only borrow books.");
        }
    }

}
