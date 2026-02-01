package pdf2;

import java.util.Scanner;

class NegativeException extends Exception {
    NegativeException(String message) {
        super(message);
    }
}

public class Assignment_07 {

    static void checkNumber(int num) throws NegativeException {
        if (num < 0) {
            throw new NegativeException("The number is negative " + num);
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter number : ");
                int number = sc.nextInt();
                checkNumber(number);
                System.out.println("number = " + number);

                sc.nextLine();
            }
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}