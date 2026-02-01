package pdf2;

class Student {
    String name;
    String address;
    int age;
    int roll_no;
    double gpa;
    String program;
    int sem;

    Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    Student(String name, int roll_no, String program, int sem) {
        this.name = name;
        this.roll_no = roll_no;
        this.program = program;
        this.sem = sem;
    }
}

public class Assignment_02 {

    public static void main(String[] args) {

        Student s1 = new Student("Abhishant Poudel", 18, "Pokhara");
        Student s2 = new Student("Nirajan Poudel", 1, "BCA", 3);

        System.out.println(s1.name);
        System.out.println(s2.name);

    }
}