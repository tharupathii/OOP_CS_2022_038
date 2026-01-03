package LW_05.Q01;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> BorrowableItemsList;

    public Library() {
        BorrowableItemsList = new ArrayList<>();
    }

    public void addlibraryitems(Book item) {
        BorrowableItemsList.add(item);
    }


    public void checkOutItem(String title) {
        for (Book book : BorrowableItemsList) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                System.out.println("It is available!");
                System.out.println("Checked out : "+book.getTitle());
                book.setAvailable(false);
            }
        }

    }

    public void listAllBorrowableItems() {
        for (Book book : BorrowableItemsList) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void displayInformation() {
        int count = 0;
        for (Book book : BorrowableItemsList) {
            if (book.isAvailable()) {
                count++;
            }
        }
        System.out.println("Book count : " + count);
    }


}
