package com.deepak;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Test {
    public static void main(String[] args) {

        /*LocalDate today = LocalDate.now();
        LocalDate nextFriday = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        LocalDate nextSaturday = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(nextFriday + "   "+ nextSaturday);

        System.out.println(verifyTripExistsForWeekend(nextFriday, nextSaturday));*/



        LocalDate today = LocalDate.now();
        LocalDate thisThursday = today.with(DayOfWeek.THURSDAY);
        if (thisThursday.isBefore(today)) {
            thisThursday = thisThursday.plusWeeks(1);
        }
        LocalDate nextTuesday = today.with(DayOfWeek.TUESDAY).plusWeeks(1);

        System.out.println(verifyTripExistsForWeekend(thisThursday, nextTuesday));

        System.out.println(verifyTripExistsForWeekend(thisThursday, nextTuesday));






        /*ZonedDateTime firstDateWithZone = ZonedDateTime.of(LocalDateTime.parse("2024-05-30T11:00:00"), ZoneId.of("Europe/Istanbul"));
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
        }*/
    }



    public static boolean verifyTripExistsForWeekend(LocalDate departureDate, LocalDate arrivalDate) {
        LocalDate nextSaturdayInstant = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        LocalDate nextSundayInstant = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        return (departureDate.equals(nextSaturdayInstant) || departureDate.equals(nextSundayInstant)
                || arrivalDate.equals(nextSaturdayInstant) || arrivalDate.equals(nextSundayInstant) ||
                (departureDate.isBefore(nextSaturdayInstant) && arrivalDate.isAfter(nextSundayInstant)));
    }



    public static boolean verifyTripExistsForWeekendd(LocalDate departureDate, LocalDate arrivalDate) {
        LocalDate currentDate = departureDate;
        int count = 0;
        if (departureDate.getDayOfWeek() == DayOfWeek.SATURDAY || departureDate.getDayOfWeek() == DayOfWeek.SUNDAY || arrivalDate.getDayOfWeek() == DayOfWeek.SATURDAY || arrivalDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return false;
        }
        while (currentDate.isBefore(arrivalDate)) {
            if (currentDate.getDayOfWeek() == DayOfWeek.SATURDAY || currentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                count = count + 1;
                break;
            }
            currentDate = currentDate.plusDays(1);
        }
        if (count > 0) {
            return false;
        }
        return true;
    }




}
