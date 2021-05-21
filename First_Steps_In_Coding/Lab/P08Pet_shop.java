package Lab;

import java.util.Scanner;

public class P08Pet_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareM=Double.parseDouble(scanner.nextLine());
        double expenses=squareM * 7.61;
        double discount=expenses * 0.18;
        double expensesWithDiscount=expenses - discount;
        System.out.printf("The final price is : %.2f lv. %n" , expensesWithDiscount);
        System.out.printf("The discount is : %.2f lv. %n",discount);
    }
}
