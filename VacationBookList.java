package FirstStepsInCodingExecise;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int amountOfDays = Integer.parseInt(scanner.nextLine());
        int result = (pages / pagesPerHour) / amountOfDays;
        System.out.println(result);
    }
}
