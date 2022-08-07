package ForLoop;

import java.util.Scanner;

public class TrakingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroups = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int musala = 0;
        int monblan = 0;
        int kilimandgaro = 0;
        int k = 0;
        int everest = 0;


        for(int i = 1; i <= countGroups; i++){
            int currentPeople = Integer.parseInt(scanner.nextLine());

            sum = sum + currentPeople;

            if(currentPeople <= 5){
                musala = musala + currentPeople;
            }else if(currentPeople <= 12){
                monblan = monblan + currentPeople;
            }else if(currentPeople <= 25){
                kilimandgaro = kilimandgaro + currentPeople;
            }else if(currentPeople <= 40){
                k = k + currentPeople;
            }else {
                everest = everest + currentPeople;
            }

        }
        System.out.printf("%.2f%%%n", musala * 1.0 / sum * 100);
        System.out.printf("%.2f%%%n", monblan * 1.0 / sum * 100);
        System.out.printf("%.2f%%%n", kilimandgaro * 1.0 / sum * 100);
        System.out.printf("%.2f%%%n", k * 1.0 / sum * 100);
        System.out.printf("%.2f%%%n", everest * 1.0 / sum * 100);

    }
}
