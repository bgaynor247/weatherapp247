package com.bgaynor247.weatherapp247.util;

import android.text.format.DateFormat;

import java.util.Calendar;

public class DateUtil {

    public static String getDate(long time) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time * 1000);
        return DateFormat.format("mm/dd", cal).toString();
    }

    public static String getTime(long time) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time * 1000);
        return DateFormat.format("hh:mm", cal).toString();
    }

}