package Lab;

import java.util.Scanner;

public class P07Projects_creation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int project = Integer.parseInt(scanner.nextLine());
        int totalHours = project * 3;
        System.out.println("The architect "+architectName+" will need "+totalHours+" hours to complete "+project+" project/s.");
    }
}
