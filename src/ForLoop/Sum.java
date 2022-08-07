package ForLoop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNumber;

            if(currentNumber > maxNumber){
                maxNumber = currentNumber;
            }

        }
        sum = sum - maxNumber;
        if(sum == maxNumber){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        }else{
            int diff = Math.abs(sum - maxNumber);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }

    }
}
