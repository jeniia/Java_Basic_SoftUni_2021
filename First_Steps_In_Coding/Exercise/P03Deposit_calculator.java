package Exercise;

import java.util.Scanner;

public class P03Deposit_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum=Double.parseDouble(scanner.nextLine());
        int months=Integer.parseInt(scanner.nextLine());
        double interestRate=Double.parseDouble(scanner.nextLine());

        double sumPerMonth=(depositSum*interestRate/100)/12;
        double result=depositSum+months*sumPerMonth;
        System.out.println(result);
    }
}
