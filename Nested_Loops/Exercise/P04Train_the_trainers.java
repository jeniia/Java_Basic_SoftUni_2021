package Exercise;

import java.util.Scanner;

public class P04Train_the_trainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        double scores = 0;
        int count = 0;
        while (!name.equals("Finish")) {
            double rating = 0;
            for (int i = 1; i <= people; i++) {
                double score = Double.parseDouble(scanner.nextLine());
                rating += score;
            }
            double averageRating = rating / people;
            scores += averageRating;
            System.out.printf("%s - %.2f.%n",name,averageRating);
            name = scanner.nextLine();
            count += 1;
            rating = 0;
        }
        double averageScore = scores / count;
        System.out.printf("Student's final assessment is %.2f.%n",averageScore);
    }
}
