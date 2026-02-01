package pdf2;

class Rect {
    int length;
    int breadth;

    void setLength(int length) {
        this.length = length;
    }

    void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    int getLength() {
        return this.length;
    }

    int getBreadth() {
        return this.breadth;
    }

    void calculateArea() {
        double area = this.length * this.breadth;
        System.out.println("Area = " + area);
    }
}

public class Assignment_10 {

    public static void main(String[] args) {

        Rect rectangle = new Rect();
        rectangle.setLength(10);
        rectangle.setBreadth(20);

        System.out.println("Length = " + rectangle.getLength());
        System.out.println("Breadth = " + rectangle.getBreadth());
        rectangle.calculateArea();
    }
}
