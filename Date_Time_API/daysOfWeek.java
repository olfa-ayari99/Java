package Date_Time_API;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class daysOfWeek {

    public static void main(String[] args){
        System.out.printf("%s%n", DayOfWeek.MONDAY.plus(3));

        //DayOfWeek enum : MONDAY to SUNDAY

        DayOfWeek dow = DayOfWeek.MONDAY;
        Locale locale = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));


        System.out.printf("%d%n", Month.FEBRUARY.maxLength());

        Month month = Month.AUGUST;
        Locale locale2 = Locale.getDefault();
        System.out.println(month.getDisplayName(TextStyle.FULL, locale2));


        // Date 
       // LocalDate date =  LocalDate.of(2000,Month.NOVEMBER, 20);
       // LocalDate nextWeek = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        

        DayOfWeek dotw = LocalDate.of(2024,Month.FEBRUARY,22).getDayOfWeek();

        LocalDate date = LocalDate.of(2000, Month.NOVEMBER,9);
        TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);

        LocalDate nextWed = date.with(adj);
        System.out.printf("for the date of %s, the next wednesday is  ", date, nextWed);

        //YEARS

        YearMonth d = YearMonth.now();
        System.out.printf("%s: %d%n", d , d.lengthOfMonth());

        //Instant Class

        Instant timestamp = Instant.now();

        



        





    }
    
}
