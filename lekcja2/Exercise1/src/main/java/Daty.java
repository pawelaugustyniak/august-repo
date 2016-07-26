import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by rb21776 on 2016-07-18.
 */
public class Daty {

    public static void main(String[] args) {

        LocalDateTime czas =  LocalDateTime.now();


        Date wybranaData = new Date(116,6,15,15,16,16);  // rok = 1900 + year;
        Date teraz = new Date();
        System.out.println("Stary sposób (Date + simpleFormatter):");
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
        System.out.println("Dzisiaj:");
        System.out.println(simpleFormatter.format(teraz));
        System.out.println("Data wybrana:");
        System.out.println(simpleFormatter.format(wybranaData));
        System.out.println("Data wybrana + 4 dni:");
        Date nowaData = dodajDni(wybranaData, 4); //dodanie 4 dni do wybranej daty
        System.out.println(simpleFormatter.format(nowaData));

        System.out.println("Nowy sposób (LocalDateTime + DateTimeFormatter):");
        System.out.println(czas);
        System.out.println("Zmiana formatu (ISO_DATE_TIME):");
        DateTimeFormatter simpleDateFormatter11 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(czas.format(simpleDateFormatter11));
        System.out.println("Po dodaniu 43 dni (LocalDateTime.plusDays)");
        System.out.println(czas.plusDays(43));

    }

    public static Date dodajDni(Date data, int dni) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.DATE,dni);
        return cal.getTime();
    }


}
