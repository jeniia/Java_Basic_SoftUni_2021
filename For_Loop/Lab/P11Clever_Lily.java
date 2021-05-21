package Lab;

import java.util.Scanner;

public class P11Clever_Lily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age=Integer.parseInt(scanner.nextLine());
        double washMachinePrice=Double.parseDouble(scanner.nextLine());
        int toyPrice=Integer.parseInt(scanner.nextLine());

        int countBrother=0;
        int toyCounter=0;
        double sumMoney=0;
        double money=0;
        for (int i = 1; i <= age ; i++) {
            if (i % 2 != 0) {
                toyCounter ++;
            }else  {
                countBrother ++;
                money = money + 10;
                sumMoney = sumMoney + money;
            }
        }

        int allToysMoney=toyCounter * toyPrice;
        double allMoney= allToysMoney + sumMoney - countBrother;
        double diff= Math.abs(allMoney - washMachinePrice);
        if (allMoney >= washMachinePrice) {
            System.out.printf("Yes! %.2f",diff);
        } else {
            System.out.printf("No! %.2f",diff);
        }
    }
}
