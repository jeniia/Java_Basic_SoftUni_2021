package Lab;

import java.util.Scanner;

public class P05Account_balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // NoMoreMoney or 5.51
        double sum= 0;
        while (!input.equals("NoMoreMoney")) {
            double currentMoney = Double.parseDouble(input);

            if (currentMoney < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum += currentMoney;

            System.out.printf("Increase: %.2f%n",currentMoney);

            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n",sum);
    }
}
