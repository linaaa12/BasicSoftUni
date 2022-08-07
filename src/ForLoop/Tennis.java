package ForLoop;

import java.util.Scanner;

public class Tennis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTour = Integer.parseInt(scanner.nextLine());
        int startScore = Integer.parseInt(scanner.nextLine());

        int initialPoints = startScore;
        int currentPoints = 0;
        int counterWins = 0;
        int countAverage = 0;

        for(int i = 1; i <= countTour; i++){
            String currentLevel = scanner.nextLine();

            switch(currentLevel){
                case "W":
                    counterWins++;
                    countAverage = countAverage + 2000;
                    currentPoints = currentPoints + 2000;
                    break;

                case "F":
                    countAverage = countAverage + 1200;
                    currentPoints = currentPoints + 1200;
                    break;

                case "SF":
                    countAverage = countAverage + 720;
                    currentPoints = currentPoints + 720;
                    break;
            }
        }
        int totalPoints = currentPoints + initialPoints;
        double averagePoints = Math.floor(countAverage * 1.0 / countTour);
        double percentWins = ( counterWins * 1.0 / countTour ) * 100;

        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%", percentWins);


    }
}
