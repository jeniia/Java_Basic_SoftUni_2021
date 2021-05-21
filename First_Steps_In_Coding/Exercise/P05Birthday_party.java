package Exercise;

import java.util.Scanner;

public class P05Birthday_party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rentHall=Integer.parseInt(scanner.nextLine());
        double cake=rentHall / 5;
        double drinks=cake - (cake * 45 / 100);
        double animator=rentHall / 3;
        double totalSum=cake + drinks + animator + rentHall;
        System.out.println(totalSum);
    }
}
