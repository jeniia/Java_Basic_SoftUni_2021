package Exercise;

import java.util.Scanner;

public class P06Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String website = scanner.nextLine();
            if (website.equals("Facebook")) {
                salary -= 150;
            } else if (website.equals("Instagram")) {
                salary -= 100;
            } else if (website.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                break;
            }
        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
