package pdf2;

import java.util.Scanner;

// series = 1 + 3 + 5 + 7 + ...... + (2n - 1)
class SeriesCalculator {

    int calculateSum(int n) {

        int a = 1;
        int d = 2;
        int sum = (n / 2) * (2 * a + (n - 1) * d);

        return sum;

    }
}

public class Assignment_09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SeriesCalculator calculator = new SeriesCalculator();

        System.out.print("Enter the number of element to calculate the sum :");

        int number = sc.nextInt();

        int sum = calculator.calculateSum(number);
        System.out.println("The sum of " + number + " is " + sum);

        sc.close();

    }
}