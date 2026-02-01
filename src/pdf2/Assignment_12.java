package pdf2;

class BCA {
    String name;
    int rollNo;
    double marks;

    BCA(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    char calculateGrade() {
        char grade = ' ';
        if (marks <= 100 && marks > 80) {
            grade = 'A';
        } else if (marks <= 80 && marks > 60) {
            grade = 'B';
        } else if (marks <= 60 && marks > 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        return grade;
    }

    void getGrade() {
        System.out.println("\n\nname = " + this.name);
        System.out.println("roll no = " + this.rollNo);
        System.out.println("marks = " + this.marks);
        System.out.println("grade = " + calculateGrade());
    }

}

public class Assignment_12 {
    public static void main(String[] args) {

        BCA s1 = new BCA("KP Oli hanyo goli", 1, 98);
        BCA s2 = new BCA("Parchande hatyara", 2, 75);
        BCA s3 = new BCA("Sere chor", 3, 56);
        BCA s4 = new BCA("Jyoti magar ", 4, 10);

        s1.getGrade();
        s2.getGrade();
        s3.getGrade();
        s4.getGrade();

    }

}