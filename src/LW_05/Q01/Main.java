package LW_05.Q01;

public class Main {
    static void main() {
        Book book1 = new Book("Seena Maragatham",
                "Sujatha Thilaka", "9789553023975", true);
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala",
                "Seynamasasekaka", "9789553548721", true);
        Book book3 = new Book("Island of a Thousand Mirrors",
                "Nayomi Munaweera", "9781616953623", true);

        Library FCT = new Library();

        FCT.addlibraryitems(book1);
        FCT.addlibraryitems(book2);
        FCT.addlibraryitems(book3);

        FCT.displayInformation();
        FCT.listAllBorrowableItems();

        FCT.checkOutItem("Island of a Thousand Mirrors");

        FCT.listAllBorrowableItems();
    }
}
