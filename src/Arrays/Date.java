package Arrays;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Date {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());

//        calculate our age
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.of(2005,1,12);
        Period per = Period.between(dob,today);
        System.out.println(per.getYears()+" years");
        System.out.println(per.getMonths()+ " months");
        System.out.println(per.getDays()+ " days");
    }
}
