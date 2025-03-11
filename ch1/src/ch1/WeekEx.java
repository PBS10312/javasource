package ch1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekEx {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now); // 2025-03-11

        // 요일에 따라 특정 숫자 반환
        // 월 1, 화 2, 수 3, 목 4, 금 5, 토 6, 일 7
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek.getValue());

        Week today = null;

        // Week.SATURDAY
        switch (dayOfWeek.getValue()) {
            case 1:
                today = Week.MONDAY;
                break;

            case 2:
                today = Week.TUESDAY;
                break;

            case 3:
                today = Week.WEDNESDAY;
                break;

            case 4:
                today = Week.THURSDAY;
                break;

            case 5:
                today = Week.FRIDAY;
                break;

            case 6:
                today = Week.SATURDAY;
                break;

            default:
                break;
        }
        System.out.println("오늘 요일 : " + today);

        if (today == Week.SUNDAY) {
            System.out.println("논다.");
        } else {
            System.out.println("쉰다.");

        }
    }
}