package Lab;

import java.util.Scanner;

public class P07Working_hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        String day=scanner.nextLine();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (number >= 10 && number <= 18) {
                    System.out.println("open");
                }else {
                    System.out.println("closed");
                }
                break;
            default:
                System.out.println("closed");
        }
    }
}
