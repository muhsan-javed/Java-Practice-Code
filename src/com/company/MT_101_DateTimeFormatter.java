package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MT_101_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        //System.out.println(dateTime);

        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd  -- E H:m:s a");//This is the format
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
        //System.out.println(Formatter);

        String myDate = dateTime.format(Formatter); // Creating date string using date and format
        System.out.println(myDate);
    }
}
