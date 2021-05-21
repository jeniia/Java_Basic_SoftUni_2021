package Exercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection=scanner.nextLine();
        int rows=Integer.parseInt(scanner.nextLine());
        int columns=Integer.parseInt(scanner.nextLine());
        double income=0.0;
        if (projection.equals("Premiere")) {
            income=rows * columns * 12;
        }
        if (projection.equals("Normal")) {
            income=rows * columns * 7.50;
        }
        if (projection.equals("Discount")) {
            income=rows * columns * 5;
        }
        System.out.printf("%.2f leva",income);
    }
}
