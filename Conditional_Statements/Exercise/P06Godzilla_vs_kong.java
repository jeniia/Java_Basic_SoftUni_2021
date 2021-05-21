package Exercise;

import java.util.Scanner;

public class P06Godzilla_vs_kong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int people=Integer.parseInt(scanner.nextLine());
        double clothePrice=Double.parseDouble(scanner.nextLine());
        double decor=budget * 0.10;
        double totalClothePrice=clothePrice * people;
        String output=" ";
        if (people > 150) {
            totalClothePrice=totalClothePrice * 0.90; }
        double expenses=decor + totalClothePrice;
        if (expenses > budget) {
            output=String.format("Not enough money!%n" +
                    "Wingard needs %.2f leva more.",expenses - budget); }
        else {
            output=String.format("Action!%n" + "Wingard starts filming with %.2f leva left.",budget - expenses);
        }
        System.out.println(output);
    }
}
