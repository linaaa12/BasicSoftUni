package ForLoop;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double startPoints = Double.parseDouble(scanner.nextLine());
        int countPeople = Integer.parseInt(scanner.nextLine());

        double totalPoints = startPoints;
        boolean isTrue = false;


        for(int i = 1; i <= countPeople; i++){

            String nameOfCountPeople = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            if(totalPoints > 1250.5){
                isTrue = true;
                break;
            }

            double currentPoints = ((nameOfCountPeople.length() * points) / 2);
            totalPoints = totalPoints + currentPoints;


        }
        if(totalPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, totalPoints);
        }else {
            double diff = Math.abs(totalPoints - 1250.5);
            System.out.printf("Sorry, %s you need %.1f more!", name, diff);

        }
    }
}
