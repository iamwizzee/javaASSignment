package pdf2;

class BCA {
    String name;
    int rollNo;
    double marks;

    double percentage = (marks / 5) * 100;
    char grade;

    double calculateGrade() {
        switch (percentage) {
            case (percentage > 80 && percentage <= 100):
                grade = 'A';
                break;

            default:
                break;
        }
    }

}

public class Assignment_12 {
    public static void main(String[] args) {

    }

}