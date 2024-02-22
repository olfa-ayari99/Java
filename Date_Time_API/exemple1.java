package Date_Time_API;

import java.util.Calendar;

public class exemple1 {

    public static void main (String[] args){
        int year = 2024;
        int month = 1;//fevrier
        int date = 22;

        Calendar cal = Calendar.getInstance();
        cal.clear();
        System.out.println();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE,date);
        
        System.out.println(cal.getTime());
        System.out.println();

    }
    
}
