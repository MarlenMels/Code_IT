import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class LessonMain {
    public static void main(String[] args) throws ParseException {
        //Date date = new Date(1000000000);
        //calculating milliseconds start from 1970
        //indexing of months start from 0
        //setYear adds to 1900 and that's why you get this number

//        Calendar date = Calendar.getInstance();
//        date.set(2008, Calendar.FEBRUARY, 10);
//        date.add(Calendar.YEAR, 2);
//        System.out.println(date.getTime());

//        LocalDate date = LocalDate.of(2008, 2, 10);
//        LocalTime time = LocalTime.now();
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(time);
//        System.out.println(date);
//        System.out.println(localDateTime);
//
//        String input = new Scanner(System.in).nextLine();
//
//        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");

//        Date parse = new Date();
//
//        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        System.out.println(dateFormat.format(parse));

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");

        System.out.println(formatter.format(date));
    }
}
