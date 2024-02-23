package com.deepak;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {
    public static void main(String[] args) {

        ZonedDateTime firstDateWithZone = ZonedDateTime.of(LocalDateTime.parse("2024-05-30T11:00:00"), ZoneId.of("Europe/Istanbul"));
        ZonedDateTime secondDateWithZone = ZonedDateTime.of(LocalDateTime.parse("2024-05-30T12:00:00"), ZoneId.of("Asia/Jakarta"));
        System.out.println(firstDateWithZone.isBefore(secondDateWithZone));
        System.out.println();

        firstDateWithZone = ZonedDateTime.of(LocalDateTime.parse("2024-05-30T11:00:00"), ZoneId.of("UTC"));
        secondDateWithZone = ZonedDateTime.of(LocalDateTime.parse("2024-05-30T12:00:00"), ZoneId.of("UTC"));
        System.out.println(firstDateWithZone.isBefore(secondDateWithZone));
        System.out.println();

        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2024-05-30T11:00+03:00[Europe/Istanbul]");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("2024-05-30T12:00+07:00[Asia/Jakarta]");
        System.out.println(zonedDateTime1.isBefore(zonedDateTime2));
        System.out.println();

        // Convert both ZonedDateTimes to UTC
        ZonedDateTime utcDateTime1 = zonedDateTime1.withZoneSameInstant(ZoneId.of("UTC"));
        ZonedDateTime utcDateTime2 = zonedDateTime2.withZoneSameInstant(ZoneId.of("UTC"));

        System.out.println(utcDateTime1.isBefore(utcDateTime2));
        System.out.println();

        // Compare the UTC versions
        int comparison = utcDateTime1.compareTo(utcDateTime2);

        if (comparison < 0) {
            System.out.println("zonedDateTime1 is earlier");
        } else if (comparison > 0) {
            System.out.println("zonedDateTime2 is earlier");
        } else {
            System.out.println("The two ZonedDateTimes are equal");
        }
    }
}
