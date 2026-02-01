package pdf1;

import java.util.Scanner;

public class Assignment_03 {

    // area of rectangle
    static int getArea(int length, int breadth) {
        int area = length * breadth;
        return area;
    }

    // area of circle
    static double getArea(double radius) {
        double area = 2 * ((double) 22 / 7) * radius * radius;
        return area;
    }

    // area of triangle
    static double getArea(double height, double breadth) {
        double area = 1 / 2f * (height * breadth);
        return area;
    }

    public static void main(String[] args) {

        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");

        try (Scanner sc = new Scanner(System.in)) {

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter lenght:");
                    int length = sc.nextInt();

                    System.out.print("Enter breadth:");
                    int breadth = sc.nextInt();

                    int areaOfRectangle = getArea(length, breadth);
                    System.out.println("Area of rectangle = " + areaOfRectangle);
                    break;

                case 2:
                    System.out.print("Enter radius:");
                    double radius = sc.nextDouble();

                    double areaOfCircle = getArea(radius);
                    System.out.println("Area of circle = " + areaOfCircle);
                    break;

                case 3:
                    System.out.print("Enter height:");
                    double height = sc.nextDouble();

                    System.out.print("Enter breadth:");
                    double breadth1 = sc.nextDouble();

                    double area = getArea(height, breadth1);
                    System.out.println("Area of triangle = " + area);
                    break;

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
