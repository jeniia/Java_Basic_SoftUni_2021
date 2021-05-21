package Exercise;

import java.util.Scanner;

public class P02Bonus_score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number=Double.parseDouble(scanner.nextLine());
        double bonus=0;
        double extraBonus=0;
        if(number <= 100) {
            bonus=5;
        }else if(number > 1000) {
            bonus=number * 0.1;
        }else {
            bonus=number * 0.2;
        } if(number % 2 ==0) {
            extraBonus = 1;
        }else if(number % 10 ==5){
            extraBonus =2;
        } System.out.println(bonus + extraBonus);
        System.out.println(number + bonus + extraBonus);

    }
}
