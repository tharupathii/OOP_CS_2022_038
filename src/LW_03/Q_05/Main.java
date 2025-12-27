package LW_03.Q_05;

public class Main {
    static void main() {
        Library library = new Library();

        Book book1 = new Book( "Seena Maragatham" ,  "Sujatha Thilaka" ,
                "9789553023975" , true );
        Book book2 = new Book( "Nuramakadya Bauthika Nuladanayakshanamaala" ,
                "Seynamasasekaka", "9789553548721" , true);
        Book book3 = new Book( "Island of a Thousand Mirrors" ,
                "Nayomi Munaweera" ,"9781616953623" , true);

        library.addItems(book1);
        library.addItems(book2);
        library.addItems(book3);

        library.checkItem(book1);

        library.listAvailableItems();

        library.displayLibraryInfo();
    }
}
