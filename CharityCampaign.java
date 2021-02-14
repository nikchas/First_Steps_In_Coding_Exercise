package FirstStepsInCodingExecise;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int amountWorkers = Integer.parseInt(scanner.nextLine());
        int amountCakes = Integer.parseInt(scanner.nextLine());
        int amountWaffles = Integer.parseInt(scanner.nextLine());
        int amountPancakes = Integer.parseInt(scanner.nextLine());

        double cakePrice = 45.00;
        double wafflePrice = 5.80;
        double pancakePrice = 3.20;

        double cakes = amountCakes * cakePrice;
        double waffles = amountWaffles * wafflePrice;
        double pancakes = amountPancakes * pancakePrice;

        double moneyPerDay = (cakes + waffles + pancakes) * amountWorkers;
        double sum = moneyPerDay * days;
        double coverSum = sum - sum*1/8;
        System.out.println(coverSum);

    }
}
