package pdf1;

class Book {
    int id;
    String name;
    double price;

    Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void displayBookInfo() {
        System.out.println("\nBook information....");
        System.out.println("ID = " + this.id);
        System.out.println("Name = " + this.name);
        System.out.println("Price = " + this.price);
    }

}

public class Assignment_05 {

    public static void main(String[] args) {

        Book myBook = new Book(1, "Game of Thrones", 2580.5);

        myBook.displayBookInfo();

    }
}