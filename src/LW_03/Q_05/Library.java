package LW_03.Q_05;

import java.util.ArrayList;

public class Library {

//    private ArrayList<BorrowableItems> BorrowableItemsList = new ArrayList<>();

    private ArrayList<BorrowableItems> BorrowableItemsList;
    public Library() {
        BorrowableItemsList = new ArrayList<>();
    }

    public void addItems(BorrowableItems item){
        BorrowableItemsList.add(item);
    }

    public void checkItem(BorrowableItems item){
        if (BorrowableItemsList.contains(item)){
            System.out.println("It is available !");
        }
        else System.out.println("It is not available !");
    }

//    public void listAllItems(){
//        for (int i = 0 ; i< BorrowableItemsList.size() ; i++){
//            System.out.println(BorrowableItemsList.get(i));
//        }
//    }
public void listAvailableItems() {
    System.out.println("\nAvailable Library Items:");
    for (BorrowableItems item : BorrowableItemsList) {
        if (item instanceof Book) {
            Book book = (Book) item;
            if (book.isAvailable()) {
                book.displayinfo();
            }
        }
    }
}
//    public void displayLibraryInfo(){
//        System.out.println("Library size : " + BorrowableItemsList.size());
//

    public void displayLibraryInfo() {
        int availableCount = 0;

        for (int i = 0; i < BorrowableItemsList.size(); i++) {
            Book book = (Book) BorrowableItemsList.get(i);

            if (book.isAvailable()) {
                availableCount++;
            }
        }
        System.out.println("Library size: " + BorrowableItemsList.size());
        System.out.println("Available items: " + availableCount);

    }

}