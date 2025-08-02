package com.LiraryManagementSystemProject;

public class LibraryItem {
    protected String itemId;
    protected String title;
    protected boolean isAvailable;

    public LibraryItem(String itemId, String title){
        this.itemId = itemId;
        this.title = title;
        this.isAvailable  = true;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void borrowItem(){
        if(isAvailable){
            System.out.println(title+" borrowed successfully.");
            isAvailable = false;
        }else {
            System.out.println(title+" isn't available.");
        }
    }

    public void returnItem(){
        isAvailable = true;
        System.out.println(title+" returned successfully.");
    }

    public void showDetails(){
        System.out.println("Id: "+itemId+"\n Title: "+title+"\n Availability Status: "+isAvailable);
    }

    public String getItemId() {
        return itemId;
    }
}
