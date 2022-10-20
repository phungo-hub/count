//import java.util.Date;

public class NextDayCalculator {
    public Date getNextDay(Date today) {
        if (isEndOfYear(today))
            return new Date(today.getYear() + 1, 0, 1);
        else if (isEndOfMonth(today))
            return new Date(today.getYear(), today.getMonth()+1, 1);
        else
            return new Date(today.getYear(), today.getMonth(), today.getDay()+1);
    }

    public boolean isEndOfYear(Date today) {
        boolean isEndOfDay = today.getDay() == 31;
        boolean isEndOfMonth = today.getDay() == 12;
        return (isEndOfDay && isEndOfMonth);
    }

    public boolean isEndOfMonth(Date today) {
        int month = today.getMonth() + 1;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return today.getDay() == 30;
            case 2:
                if (isLeapYear(today))
                    return today.getDay() == 29;
                else
                    return today.getDay() == 28;
            default:
                return today.getDay() == 31;
        }
    }

    public boolean isLeapYear(Date today) {
        int year = today.getYear();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400)
                    isLeapYear = true;
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }
}
