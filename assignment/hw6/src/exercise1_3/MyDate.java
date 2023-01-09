package exercise1_3;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1) {
            return false;
        }

        if (month != 2 || !isLeapYear(year)) {
            return day <= DAYS_IN_MONTHS[month - 1];
        }

        return day <= DAYS_IN_MONTHS[month - 1] + 1;
    }

    private static final int[] FIRST_NUMBER_VALUE = {6, 4, 2, 0};
    private static final int[] NON_LEAF_YEAR_VALUE = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    private static final int[] LEAF_YEAR_VALUE = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public static int getDayOfWeek(int year, int month, int day) {
        int firstTwoDigits = year / 100;
        int lastTwoDigits = year % 100;
        int dayOfWeek = FIRST_NUMBER_VALUE[firstTwoDigits % 4] + lastTwoDigits + lastTwoDigits / 4;
        dayOfWeek += isLeapYear(year) ? LEAF_YEAR_VALUE[month - 1] : NON_LEAF_YEAR_VALUE[month - 1];
        dayOfWeek += day;
        return dayOfWeek % 7;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (day < 1 || (month != 2 && day > DAYS_IN_MONTHS[month - 1]) || (month == 2 && day > DAYS_IN_MONTHS[month - 1] + 1)) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s %04d", DAYS[getDayOfWeek(year, month, day)], day, MONTHS[month - 1], year);
    }

    public MyDate nextDay() {
        day++;
        boolean leapYear = isLeapYear(year);
        if (((!leapYear || month != 2) && day > DAYS_IN_MONTHS[month - 1]) || (leapYear && month == 2 && day > DAYS_IN_MONTHS[month - 1] + 1)) {
            nextMonth();
            day = 1;
        }
        return this;
    }

    public MyDate nextMonth() {
//        boolean leapYear = isLeapYear(year);
//        if ((leapYear && month == 2 && day == DAYS_IN_MONTHS[month - 1] + 1) || ((!leapYear || month != 2) && day == DAYS_IN_MONTHS[month - 1])) {
//            check = true;
//        }
        if (month == 12) {
            nextYear();
            month = 1;
        } else {
            month++;
        }
        if (day > DAYS_IN_MONTHS[month - 1]) {
            day = DAYS_IN_MONTHS[month - 1];
        }

        return this;
    }

    public MyDate nextYear() {
        if (year == 9999) {
            throw new IllegalStateException("Year out of range!");
        }
        year++;
        if (day > DAYS_IN_MONTHS[month - 1]) {
            day = DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }

    public MyDate previousDay() {
        if (day == 1) {
            previousMonth();
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day++;
            }
        } else {
            day--;
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            previousYear();
            month = 12;
        } else {
            month--;
        }
        if (day > DAYS_IN_MONTHS[month - 1]) {
            if (isLeapYear(year) && month == 2) {
                day = DAYS_IN_MONTHS[month - 1] + 1;
            } else {
                day = DAYS_IN_MONTHS[month - 1];
            }
        }
        return this;
    }

    public MyDate previousYear() {
        if (year == 0) {
            throw new IllegalStateException("Year out of range!");
        }
        year--;
        if (day > DAYS_IN_MONTHS[month - 1]) {
            day = DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }
}
