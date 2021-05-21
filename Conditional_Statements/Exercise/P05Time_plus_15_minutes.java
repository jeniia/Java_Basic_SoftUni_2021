package Exercise;

import java.util.Scanner;

public class P05Time_plus_15_minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chas = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());
        minute+=15;
        if(minute > 59) {
            minute-=60;
            chas+=1;
            if (chas==24) {
                chas=0;
            }
        }
        if(minute <= 9) {
            System.out.printf("%d:0%d", chas, minute);
        }
        else {
            System.out.printf("%d:%d", chas, minute);
        }

    }
}
