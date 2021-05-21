package Lab;

import java.util.Scanner;

public class P09Yard_greening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs=Integer.parseInt(scanner.nextLine());
        int allAnimals=Integer.parseInt(scanner.nextLine());
        double countFoodDogs=2.50;
        int countFoodAll=4;
        double result=dogs *  countFoodDogs+ allAnimals * countFoodAll;
        System.out.print(result);
        System.out.print("(Крайна сума) lv.");
    }
}
