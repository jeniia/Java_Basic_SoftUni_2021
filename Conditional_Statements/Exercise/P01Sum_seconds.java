package Exercise;

import java.util.Scanner;

public class P01Sum_seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int two=Integer.parseInt(scanner.nextLine());
        int third=Integer.parseInt(scanner.nextLine());
        int totalTime=first + two + third;
        int minutes=totalTime / 60;
        int seconds=totalTime % 60;
        if (seconds < 10){
            System.out.printf("%d:0%d",minutes,seconds);

        }else {
            System.out.printf("%d:%d",minutes,seconds);
        }
    }
}
