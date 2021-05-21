package Exercise;

import java.util.Scanner;

public class P07Fruit_market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberriesPrice=Double.parseDouble(scanner.nextLine());
        double bananasKg=Double.parseDouble(scanner.nextLine());
        double orangeKg=Double.parseDouble(scanner.nextLine());
        double raspberriesKg=Double.parseDouble(scanner.nextLine());
        double strawberriesKg=Double.parseDouble(scanner.nextLine());

        double raspberriesPrice=strawberriesPrice -(strawberriesPrice * 0.50);
        double orangePrice=raspberriesPrice - (raspberriesPrice * 0.4);
        double bananasPrice=raspberriesPrice - (raspberriesPrice * 0.8);
        double result=(raspberriesPrice * raspberriesKg) + (orangePrice * orangeKg) +( bananasPrice * bananasKg) + (strawberriesPrice * strawberriesKg);
        System.out.printf("%.2f" , result);
    }
}
