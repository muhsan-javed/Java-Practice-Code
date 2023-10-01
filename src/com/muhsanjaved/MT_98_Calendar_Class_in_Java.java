package com.muhsanjaved;

import java.util.Calendar;

public class MT_98_Calendar_Class_in_Java {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

        System.out.println(c.getTimeZone().getID());

    }
}
