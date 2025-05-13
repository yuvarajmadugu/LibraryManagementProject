package com.LiraryManagementSystemProject;

public class User {
    protected String userId;
    protected String name;
    protected int maxBorrowLimit = 1;
    private LibraryItem borrowedItem;

    public User(String userId, String name){
        this.userId = userId;
        this.name = name;
        this.borrowedItem = null;
    }

    public void borrow(LibraryItem item){
        if(borrowedItem != null){
            System.out.println(name+" has already borrowed an Item. User limit is over, First return item. ");
        } else if (item.isAvailable()) {
            borrowedItem = item;
            item.borrowItem();
        }
    }

    public void returnItem(){
        if(borrowedItem==null){
            System.out.println(name+" has no borrowed items.");
        }else{
            borrowedItem.returnItem();
            borrowedItem = null;
        }
    }

    public void showBorrowedItems(){
        if(borrowedItem == null){
            System.out.println(name+" has no borroweditems.");
        }else{
            System.out.println(name+" has Borrowed Item.");
            borrowedItem.showDetails();
        }
    }
}

