package Exercise;

import java.util.Scanner;

public class P04Vacation_books_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sheets=Integer.parseInt(scanner.nextLine());
        int sheetsPerHours=Integer.parseInt(scanner.nextLine());
        int days=Integer.parseInt(scanner.nextLine());

        int totalHours=sheets/sheetsPerHours;
        int neededHours=totalHours/days;
        System.out.println(neededHours);
    }
}
