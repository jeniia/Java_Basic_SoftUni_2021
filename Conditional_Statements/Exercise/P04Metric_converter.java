package Exercise;

import java.util.Scanner;

public class P04Metric_converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num=Double.parseDouble(scanner.nextLine());
        String input=scanner.nextLine();
        String output=scanner.nextLine();
        if(input.equals("mm")) {
            num=num / 1000;
        } else if (input.equals("cm")) {
            num = num / 100;
        }
        if (output.equals("mm")) {
            num=num * 1000;
        } else if (output.equals("cm")) {
            num=num * 100; }
        System.out.printf("%.3f",num);
    }
}
