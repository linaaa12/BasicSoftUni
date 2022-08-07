package Conditional;

import java.util.Scanner;

public class OperationNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        char operation = scanner.nextLine().charAt(0);

        double result = 0;
        String oddOrEven = "";

        if(operation == '+'){
            result = numOne + numTwo;
            if(result % 2 == 0){
                oddOrEven = "even";
            }else{
                oddOrEven = "odd";
            }

        }else if(operation == '-'){
            result = numOne - numTwo;
            if(result % 2 == 0){
                oddOrEven = "even";
            }else{
                oddOrEven = "odd";
            }

        }else if(operation == '*'){
            result = numOne * numTwo;
            if(result % 2 == 0){
                oddOrEven = "even";
            }else{
                oddOrEven = "odd";
            }

        }else if(operation == '/'){
            if(numTwo == 0){
                System.out.printf("Cannot divide %d by zero", numOne);
            }else{
                result = numOne * 1.0 / numTwo;
                System.out.printf("%d / %d = %.2f", numOne, numTwo, result);
            }

        }else if(operation == '%'){
            if(numTwo == 0){
                System.out.printf("Cannot divide %d by zero", numOne);
            }else{
                result = numOne % numTwo;
                System.out.printf("%d %% %d = %.0f", numOne, numTwo, result);
            }

        }
         if(operation == '+' || operation == '-' || operation == '*'){
             System.out.printf("%d %c %d = %.0f - %s", numOne, operation, numTwo, result, oddOrEven);
         }
    }
}
