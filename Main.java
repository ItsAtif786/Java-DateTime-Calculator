import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    // Entry point of the program
    public static void main(String[] args) {
        // Call the methods to execute the desired functionality
        getCurrentDayAndTime();
        calculate(10, 5, "multiplication");
    }

    // Problem 1
    public static void getCurrentDayAndTime() {
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek currentDay = now.getDayOfWeek();
        String day = currentDay.toString();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh a : mm : ss");
        String currentTime = now.format(timeFormatter);

        System.out.println("Today is: " + day);
        System.out.println("Current time is: " + currentTime);
    }

    // Problem 2
    public static void calculate(double num1, double num2, String operation) {
        double result;
        if (operation.equals("multiplication")) {
            result = num1 * num2;
        } else if (operation.equals("division")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                result = Double.POSITIVE_INFINITY;
                System.out.println("Sorry! Cannot divide by zero");
            }
        } else {
            result = Double.NaN;
            System.out.println("Sorry! Invalid operation");
        }

        System.out.println("Result: " + result);
    }
}
