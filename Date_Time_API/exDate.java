package Date_Time_API;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class exDate {

    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1999,Month.JUNE,26);

        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("you are "+ p.getYears()+ " years, "+ p.getMonths()+ " months, "+ p.getDays()+" days old. (" +p2+ " day total");

    }
    
}
