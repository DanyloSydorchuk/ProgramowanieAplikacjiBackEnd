import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) {

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Aktualny lokalny czas: " + formatter1.format(now));
        

        DateFormat formatter2 = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        Date today = new Date();
        formatter2.setTimeZone(TimeZone.getTimeZone(""));
        String GMT = formatter2.format(today);
        System.out.println("Aktualny czas GMT : " + GMT);




    }
}
