package Lab;

import java.util.Scanner;

public class P05Password_guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password=scanner.nextLine();
        if (password.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome"); }
        else {
            System.out.println("Wrong password!");
        }
    }
}
