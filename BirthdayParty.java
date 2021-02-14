package FirstStepsInCodingExecise;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());
        double cakePrice = 0.2*rent;
        double priceDrinks = cakePrice - 0.45*cakePrice;
        double priceAnimator = rent/3.0;
        double neededSum = rent + cakePrice + priceDrinks + priceAnimator;
        System.out.println(neededSum);
    }
}
