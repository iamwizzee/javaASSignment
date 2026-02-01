package pdf1;

import java.util.Scanner;

public class Assignment_04 {

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static double division(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Division");

            int choice = sc.nextInt();

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number number: ");
            int num2 = sc.nextInt();

            double result = 0;

            switch (choice) {
                case 1:

                    result = add(num1, num2);
                    break;
                case 2:
                    result = sub(num1, num2);
                    break;
                case 3:
                    result = division(num1, num2);
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }

            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}