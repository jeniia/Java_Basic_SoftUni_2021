package Exercise;

import java.util.Scanner;

public class P06Charity_campaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysCompany=Integer.parseInt(scanner.nextLine());
        int broySladkary=Integer.parseInt(scanner.nextLine());
        int broyCake=Integer.parseInt(scanner.nextLine());
        int broyGofrety=Integer.parseInt(scanner.nextLine());
        int broyPankeys=Integer.parseInt(scanner.nextLine());

        double cakePrice=45;
        double gofretyPrice=5.80;
        double pankeysPrice=3.20;
        double totalSum=(broyCake * cakePrice) + (broyGofrety * gofretyPrice) + (broyPankeys * pankeysPrice);
        double totalSum2=(totalSum * broySladkary) * daysCompany;
        double pechalba=totalSum2 - (totalSum2 / 8);
        System.out.printf("%.2f" , pechalba);
    }
}
