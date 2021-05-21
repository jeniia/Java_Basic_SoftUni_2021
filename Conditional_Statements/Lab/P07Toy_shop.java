package Lab;

import java.util.Scanner;

public class P07Toy_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holidayPrice=Double.parseDouble(scanner.nextLine());
        int puzzles=Integer.parseInt(scanner.nextLine());
        int dolls=Integer.parseInt(scanner.nextLine());
        int teddyBears=Integer.parseInt(scanner.nextLine());
        int minions=Integer.parseInt(scanner.nextLine());
        int trucks=Integer.parseInt(scanner.nextLine());
        double puzzlePrice=2.60;
        double dollPrice=3.00;
        double teddyBearsPrice=4.10;
        double minionPrice=8.20;
        double trucksPrice=2.00;
        double totalSoldToys=(puzzles * puzzlePrice) + (dolls * dollPrice) + (teddyBears * teddyBearsPrice) +
                (minions * minionPrice) + (trucks * trucksPrice);
        int totalToysCount=puzzles + dolls + teddyBears + minions + trucks;
        if (totalToysCount >= 50) {
            totalSoldToys=totalSoldToys - (totalSoldToys * 0.25);  }
        totalSoldToys=totalSoldToys - (totalSoldToys * 0.10);
        if (totalSoldToys >= holidayPrice) {
            double leftMoneys=totalSoldToys - holidayPrice;
            System.out.printf("Yes! %.2f lv left." , leftMoneys); }
        else {
            double moneyNeded=holidayPrice - totalSoldToys;
            System.out.printf("Not enough money! %.2f lv needed." , moneyNeded);
        }
    }
}
