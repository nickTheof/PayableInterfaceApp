package gr.nikolaostheofanis.books.javabook.ch10.PayableInterfaceApp;

public class Date {
    private int year;
    private int month;
    private int day;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int year, int month, int day){
        // check if month in range
        if (month <= 0 || month > 12){
            throw new IllegalArgumentException("Month " + month + " must be 1 - 12");
        }
        // check if day in range for month
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29))){
            throw new IllegalArgumentException("Day " + day + " is out of range for the specified month and year");
        }

        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0))){
            throw new IllegalArgumentException("Day " + day + " is out of range for the specified month and year");
        }

        this.year = year;
        this.month = month;
        this.day = day;

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

    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }

}
