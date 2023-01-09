package exercise1_3;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2012, 2, 28);
        System.out.println(date1);
        System.out.println(date1.nextDay());
        System.out.println(date1.nextDay());
        System.out.println(date1.nextMonth());
        System.out.println(date1.nextYear());

        MyDate date2 = new MyDate(2012, 1, 2);
        System.out.println(date2);
        System.out.println(date2.previousDay());
        System.out.println(date2.previousDay());
        System.out.println(date2.previousMonth());
        System.out.println(date2.previousYear());

        MyDate date3 = new MyDate(2012, 3, 30);
        System.out.println(date3.previousMonth());
        System.out.println(date3.nextYear());

        MyDate date4 = new MyDate(2011, 12, 28);
        while (true) {
            System.out.println(date4);
            if (date4.getDay() == 2 && date4.getMonth() == 3 && date4.getYear() == 2012) {
                break;
            }
            date4.nextDay();
        }
    }
}
