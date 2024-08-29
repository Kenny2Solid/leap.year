public class assignment {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return div100Check(year);
        } else {
            return false;
        }
    }

    private static boolean div100Check(int year) {
        if (year % 100 == 0) {
            return div400Check(year);
        } else {
            return true;
        }
    }

    private static boolean div400Check(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}