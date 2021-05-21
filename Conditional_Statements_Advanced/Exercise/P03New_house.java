package Exercise;

import java.util.Scanner;

public class P03New_house {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kindOfFlowers = scanner.nextLine();
        int countOfFlowers = Integer.parseInt(scanner.nextLine());
        double budget=Double.parseDouble(scanner.nextLine());
        double priceFlowers=0.0;
        switch (kindOfFlowers) {
            case "Roses":
                priceFlowers = countOfFlowers * 5.00;
                if (countOfFlowers > 80) {
                    priceFlowers *=0.90;
                }
                break;
            case "Dahlias":
                priceFlowers = countOfFlowers * 3.80;
                if (countOfFlowers > 90) {
                    priceFlowers *= 0.85;
                }
                break;
            case "Tulips":
                priceFlowers = countOfFlowers * 2.80;
                if (countOfFlowers > 80) {
                    priceFlowers *= 0.85;
                }
                break;
            case "Narcissus":
                priceFlowers = countOfFlowers * 3.00;
                if (countOfFlowers < 120) {
                    priceFlowers *= 1.15;
                }
                break;
            case "Gladiolus":
                priceFlowers = countOfFlowers * 2.50;
                if (countOfFlowers < 80) {
                    priceFlowers *= 1.20;
                }
                break;
        }
        double remainingMoney = Math.abs(budget - priceFlowers);
        if (budget >= priceFlowers) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",countOfFlowers,kindOfFlowers,remainingMoney);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(remainingMoney));
        }
    }
}
