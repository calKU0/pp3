public class MyCalendar {
    static int year = 2023;
    static int month = 2;
    static int day = 9;

    static String myDate()
    {
        return String.format("%d-%02d-%02d", year,month,day);
    }

    static int days()
    {
        int days = 0;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int c = 1; c < month; c++)
        {
            days = days + daysInMonth[c-1];
        }
        days = days + day;

        return days;
    }

    static String monthName(int i)
    {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
        return month[i - 1];
    }

}
