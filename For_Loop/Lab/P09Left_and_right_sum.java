package Lab;

import java.util.Scanner;

public class P09Left_and_right_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        int leftSum=0;

        for (int i = 1; i <= n; i++) {
            int currentNum=Integer.parseInt(scanner.nextLine());
            leftSum += currentNum;
        }

        int rightSum=0;
        for (int i = 1; i <= n; i++) {
            int currentNum=Integer.parseInt(scanner.nextLine());
            rightSum += currentNum;
        }
        if (rightSum == leftSum) {
            System.out.printf("Yes, sum = %d",Math.abs(rightSum=leftSum));
        }else {

            System.out.printf("No, diff = %d",Math.abs(rightSum - leftSum));
        }
    }
}
