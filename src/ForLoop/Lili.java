package ForLoop;

import java.util.Scanner;

public class Lili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int money = 0;
        int countToys = 0;
        int sum = 0;
        int countBrother = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + 10;
                sum = sum + money;
                countBrother++;

            } else {
                countToys++;
            }

        }
        int totalSum = sum + (countToys * priceToy) - countBrother;
        double diff = Math.abs(totalSum - priceWashingMachine);

        if (totalSum >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", diff);
        } else if(totalSum < priceWashingMachine){
            System.out.printf("No! %.2f", diff);
        }
    }
}
