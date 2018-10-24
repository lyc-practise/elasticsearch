package cn.business.server.search.es.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {

    private static final String defaultPattern = "yyyy-MM-dd HH:mm:ss";

    public static String format(Date date, String pattern){
        return DateTimeFormatter.ofPattern(pattern).format(toLocalDateTime(date));
    }

    public static String format(Date date){
        return format(date, defaultPattern);
    }

    public static Date parse(String text, String pattern){
//        return DateTimeFormatter.ofPattern(pattern).parse(text);
        return null;
    }

    private static LocalDateTime toLocalDateTime(Date date){
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    public static void main(String[] args) {
        System.out.println(format(new Date(), "yyyy"));
    }
}
