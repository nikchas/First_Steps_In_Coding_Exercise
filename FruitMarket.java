package FirstStepsInCodingExecise;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPriceInKg = Double.parseDouble(scanner.nextLine());
        double amountOfBananas = Double.parseDouble(scanner.nextLine());
        double amountOfOranges = Double.parseDouble(scanner.nextLine());
        double amountOfRaspberry = Double.parseDouble(scanner.nextLine());
        double amountOfStrawberry = Double.parseDouble(scanner.nextLine());

        //double priceOfStrawberry = strawberryPriceInKg*amountOfStrawberry;
        double priceOfRaspberry = 0.5 * strawberryPriceInKg;
        double priceOfOranges = priceOfRaspberry - 0.4 * priceOfRaspberry;
        double priceOfBananas = priceOfRaspberry - 0.8 * priceOfRaspberry;

        double sumBananas = amountOfBananas * priceOfBananas;
        double sumOrange = amountOfOranges * priceOfOranges;
        double sumRaspberry = amountOfRaspberry * priceOfRaspberry;
        double sumStrawberry = amountOfStrawberry * strawberryPriceInKg;
        double total = sumBananas + sumOrange + sumRaspberry + sumStrawberry;

        System.out.printf("%.2f", total);

    }
}
