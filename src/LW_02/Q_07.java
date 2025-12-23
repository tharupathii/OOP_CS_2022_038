package LW_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_07 {
    static void main() {
        Date today = new Date();
        SimpleDateFormat dformat = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println(dformat.format(today));
    }
}
