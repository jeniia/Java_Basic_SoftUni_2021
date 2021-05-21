package Exercise;

import java.util.Scanner;

public class P07World_swimming_record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord=Double.parseDouble(scanner.nextLine());
        double distance=Double.parseDouble(scanner.nextLine());
        double timeForMeter=Double.parseDouble(scanner.nextLine());


        double ivanTime = distance * timeForMeter;
        double slowingDistance = Math.floor(distance / 15);
        double lostTime = (slowingDistance * 12.5);
        double ivanResult = ivanTime + lostTime;
        double difference = Math.abs(ivanResult - worldRecord);
        if(worldRecord <= ivanResult){
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",ivanResult);
        }
    }
}
