package ForLoop;

        import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        //int totalSalary = 0;

        for (int i = 1; i <= n; i++) {

            String tap = scanner.nextLine();


            if (tap.equals("Facebook")) {
                salary = salary - 150;
            } else if (tap.equals("Instagram")) {
                salary = salary - 100;
            } else if (tap.equals("Reddit")) {
                salary = salary - 50;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }

        }

        if(salary != 0){
            System.out.println(salary);
        }

    }
}
