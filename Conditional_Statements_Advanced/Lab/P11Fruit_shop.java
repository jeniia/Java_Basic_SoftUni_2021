package Lab;

import java.util.Scanner;

public class P11Fruit_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double result = 0;


        if (!day.equals("Monday") && !day.equals("Tuesday") && !day.equals("Wednesday") && !day.equals("Thursday") && !day.equals("Friday") && !day.equals("Saturday") && !day.equals("Sunday") || (!product.equals("banana") && !product.equals("kiwi") && !product.equals("orange") && !product.equals("apple") && !product.equals("pineapple") && !product.equals("grapes") && !product.equals("grapefruit"))) {
            System.out.println("error");
        }
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (product.equals("banana")) {
                result = amount * 2.50;
                System.out.printf("%.2f", result);
            }
            if (product.equals("apple")) {
                result = amount * 1.20;
                System.out.printf("%.2f", result);
            }
            if (product.equals("orange")) {
                result = amount * 0.85;
                System.out.printf("%.2f", result);
            }
            if (product.equals("grapefruit")) {
                result = amount * 1.40;
                System.out.printf("%.2f", result);
            }
            if (product.equals("kiwi")) {
                result = amount * 2.70;
                System.out.printf("%.2f", result);
            }
            if (product.equals("pineapple")) {
                result = amount * 5.50;
                System.out.printf("%.2f", result);
            }
            if (product.equals("grapes")) {
                result = amount * 3.85;
                System.out.printf("%.2f", result);
            }

        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (product.equals("banana")) {
                result = amount * 2.70;
                System.out.printf("%.2f", result);
            }
            if (product.equals("apple")) {
                result = amount * 1.25;
                System.out.printf("%.2f", result);
            }
            if (product.equals("orange")) {
                result = amount * 0.90;
                System.out.printf("%.2f", result);
            }
            if (product.equals("grapefruit")) {
                result = amount * 1.60;
                System.out.printf("%.2f", result);
            }
            if (product.equals("kiwi")) {
                result = amount * 3.00;
                System.out.printf("%.2f", result);
            }
            if (product.equals("pineapple")) {
                result = amount * 5.60;
                System.out.printf("%.2f", result);
            }
            if (product.equals("grapes")) {
                result = amount * 4.20;
                System.out.printf("%.2f", result);
            }
        }
    }
}
