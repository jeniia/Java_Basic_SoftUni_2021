package Lab;

import java.util.Scanner;

public class P06Area_of_figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figura=scanner.nextLine();
        if (figura.equals("square")) {
            double a=Double.parseDouble(scanner.nextLine());
            double result=a * a;
            System.out.println(result); }
        else {
            if (figura.equals("rectangle")) {
                double a=Double.parseDouble(scanner.nextLine());
                double b=Double.parseDouble(scanner.nextLine());
                double result=a * b;
                System.out.println(result); }
            else if (figura.equals("circle")) {
                double r=Double.parseDouble(scanner.nextLine());
                double result=Math.PI * (Math.pow(r,2));
                System.out.println(result); }
            else if (figura.equals("triangle")) {
                double a=Double.parseDouble(scanner.nextLine());
                double ha=Double.parseDouble(scanner.nextLine());
                double result=a * ha / 2;
                System.out.printf("%.3f",result); }
        }
    }
}
