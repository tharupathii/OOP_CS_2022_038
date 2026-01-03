package LW_05.Q_01;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book>  BorrowableItemsList = new ArrayList<>();

    //add
    public void addBorrowableItems(BorrowableItems borrowableItems){
        BorrowableItemsList.add((Book) borrowableItems);
    }

    //checkout
    public void checkOutBorrowableItems(String title){
        for (Book book : BorrowableItemsList){

            if (book.getTitle().equals(title) && book.isAvailable()){
                System.out.println("The book is available !");
                System.out.println("CheckingOut : "+book.getTitle());
                book.setAvailable(false);
            }else {
                System.out.println("Book not found !");
            }
        }

    }
    public void listBorrowableItems(){
        System.out.println("Available books :");
        for(Book book : BorrowableItemsList){
            if(book.isAvailable()){
                System.out.println(book.getTitle()+"______");
            }
        }
    }
//    public void displayInformation(){
//        int bookCount = 0;
//        for (Book book : BorrowableItemsList){
//            if()
//        }
//    }

}
