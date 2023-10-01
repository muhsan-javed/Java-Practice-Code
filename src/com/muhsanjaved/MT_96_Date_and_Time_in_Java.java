package com.muhsanjaved;

public class MT_96_Date_and_Time_in_Java {
    public static void main(String[] args) {
        long date = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
        System.out.println(System.currentTimeMillis() / 1000);
        System.out.println(date);
        System.out.println(Long.MAX_VALUE);
    }
}
