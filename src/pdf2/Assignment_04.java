package pdf2;

import java.util.Scanner;

class Emp {
    int id;
    double salary;

    void displayInfo() {
        System.out.println("ID = " + this.id);
        System.out.println("Salary = " + this.salary);
    }
}

public class Assignment_04 {

    public static void main(String[] args) {
        int noOFEmps = 2;
        Emp[] emps = new Emp[noOFEmps];

        try (Scanner sc = new Scanner(System.in)) {

            for (int i = 0; i < noOFEmps; i++) {
                emps[i] = new Emp();
                System.out.print("Enter employee id for employee " + (i + 1) + " : ");
                emps[i].id = sc.nextInt();

                System.out.print("Enter employee salary for employee " + (i + 1) + " : ");
                emps[i].salary = sc.nextDouble();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Emp empWithHighestSalary = emps[0];

        for (int i = 0; i < noOFEmps; i++) {
            if (emps[i].salary > empWithHighestSalary.salary) {
                empWithHighestSalary = emps[i];
            }

        }

        System.out.println("\n\nDetails of employee with highst salary..");
        empWithHighestSalary.displayInfo();
    }
}