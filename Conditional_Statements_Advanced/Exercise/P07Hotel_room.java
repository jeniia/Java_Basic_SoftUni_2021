package Exercise;

import java.util.Scanner;

public class P07Hotel_room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());
        switch (month) {

            case "May":
            case "October":
                double studio = 50;
                double apartment = 65;

                if (nightsCount > 14) {
                    studio *= 0.70;
                    apartment *= 0.90;
                } else if (nightsCount > 7) {
                    studio *= 0.95;
                }
                double priceStudio = nightsCount * studio;
                double priceApartment = nightsCount * apartment;
                System.out.printf("Apartment: %.2f lv. %n", priceApartment);
                System.out.printf("Studio: %.2f lv.", priceStudio);

                break;
            case "June":
            case "September":
                double studioJS = 75.20;
                double apartmentJS = 68.70;

                if (nightsCount > 14) {
                    studioJS *= 0.80;
                    apartmentJS *= 0.90;
                }
                double priceStudioJS = nightsCount * studioJS;
                double priceApartmentJS = nightsCount * apartmentJS;
                System.out.printf("Apartment: %.2f lv. %n", priceApartmentJS);
                System.out.printf("Studio: %.2f lv.", priceStudioJS);

                break;
            case "July":
            case "August":
                double studioJA = 76;
                double apartmentJA = 77;

                if (nightsCount > 14) {
                    apartmentJA *= 0.90;
                }
                double priceStudioJA = nightsCount * studioJA;
                double priceApartmentJA = nightsCount * apartmentJA;
                System.out.printf("Apartment: %.2f lv. %n", priceApartmentJA);
                System.out.printf("Studio: %.2f lv.", priceStudioJA);

                break;
        }

    }
}
