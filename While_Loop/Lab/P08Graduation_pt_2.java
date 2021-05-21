package Lab;

import java.util.Scanner;

public class P08Graduation_pt_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double sum =0;
        int excluded = 0;
        int count = 1;
        while (count <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4.0) {
                excluded ++;
            } else {
                count ++;
            }
            if (excluded > 1) {
                break;
            }
            sum += grade;

        }
        if (excluded > 1) {
            System.out.printf("%s has been excluded at %d grade",name,count);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f",name,sum / 12);
        }
    }
}
