import java.lang.Exception;
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        while ((year >= 0) && (year <= 3000)) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.printf("%d is leap year\n", year);
            } else {
                System.out.printf("%d is not leap year\n", year);
            }
            year = scanner.nextInt();
        }
    }
}
