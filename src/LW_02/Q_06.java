package LW_02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Q_06 {
    static void main() {
//        GregorianCalendar today = new GregorianCalendar();
//        System.out.println(today.getTime());
//        System.out.println(Calendar.YEAR);
//        System.out.println(today.get(Calendar.YEAR));

        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
//        System.out.println(today);
        System.out.println(format.format(today));
    }
}
