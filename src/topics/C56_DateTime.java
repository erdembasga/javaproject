package topics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C56_DateTime {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime);

        LocalDateTime specificDateTime = LocalDateTime.of(2024, 4, 26, 16, 35, 35);
        System.out.println("specificDateTime = " + specificDateTime);

        System.out.println(currentDateTime.getYear());
        System.out.println(currentDateTime.getMonth());
        System.out.println(currentDateTime.getDayOfWeek());
        System.out.println(currentDateTime.getDayOfMonth());
        System.out.println(currentDateTime.getHour());
        System.out.println(currentDateTime.getMinute());
        System.out.println(currentDateTime.getSecond());
        System.out.println(currentDateTime.getNano());


    }
}
