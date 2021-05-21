package Lab;

import java.util.Scanner;

public class P04Inches_to_centimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inch = Double.parseDouble(scanner.nextLine());
        double sm = inch * 2.54;
        System.out.println(sm);
    }
}
