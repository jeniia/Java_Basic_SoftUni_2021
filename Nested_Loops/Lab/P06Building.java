package Lab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRoom = Integer.parseInt(scanner.nextLine());

        for (int floor = countFloors; floor >= 1; floor--) {
            for (int room = 0; room < countRoom; room++) {
                String letter = "";
                if (floor == countFloors) {
                    letter = "L";
                } else if (floor % 2 != 0) {
                    letter = "A";
                } else {
                    letter = "O";
                }
                System.out.printf("%s%d%d ",letter,floor,room);
            }
            System.out.println();
        }
    }
}
