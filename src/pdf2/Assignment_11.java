package pdf2;

class Studentt {

    String firstName;
    String lastName;

    Studentt(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFullName() {
        return firstName + " " + lastName;
    }
}

public class Assignment_11 {

    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Doe";

        Studentt student = new Studentt(firstName, lastName);
        System.out.println("Full Name = " + student.getFullName());
    }
}
