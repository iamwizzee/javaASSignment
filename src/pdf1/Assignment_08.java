package pdf1;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
}

public class Assignment_08 {

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, 50000.45);
        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.salary);
    }
}