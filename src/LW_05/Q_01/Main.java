package LW_05.Q_01;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Seena Maragatham",  "Sujatha Thilaka" ,"9789553023975",true);
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721",true);
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera","9781616953623",true);
        Library FCTLibrary = new Library();

        FCTLibrary.addBorrowableItems(book1);
        FCTLibrary.addBorrowableItems(book2);
        FCTLibrary.addBorrowableItems(book3);

      //  FCTLibrary.displayInformation();
        FCTLibrary.listBorrowableItems();

        FCTLibrary.checkOutBorrowableItems("Island of a Thousand Mirrors");
    }
}
