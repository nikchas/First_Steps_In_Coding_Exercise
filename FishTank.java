package FirstStepsInCodingExecise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int vOfAquarium = a*b*h;
        double litersOfWater = vOfAquarium * 0.001;
        double decimeter = percentage * 0.01;
        double finalLiters = litersOfWater * (1 - percentage/100.0);

        System.out.printf("%.3f", finalLiters);
    }
}
