package Exercise;

import java.util.Scanner;

public class P08Fish_tank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght=Integer.parseInt(scanner.nextLine());
        int widht=Integer.parseInt(scanner.nextLine());
        int height=Integer.parseInt(scanner.nextLine());
        double percent=Double.parseDouble(scanner.nextLine());

        double volumeInCm=(lenght)*(widht)*(height);
        double volumeInLitrer=volumeInCm*0.001;
        double neededLitres=volumeInLitrer-(volumeInLitrer*percent/100);
        System.out.printf("%.2f",neededLitres);
    }
}
