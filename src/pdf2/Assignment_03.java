package pdf2;

class EvenNumber extends Thread {
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println(i + " even number");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class OddNumber extends Thread {
    public void run() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i + " odd number");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Assignment_03 {

    public static void main(String[] args) {
        Thread evenThread = new EvenNumber();
        Thread oddThread = new OddNumber();

        evenThread.start();
        oddThread.start();
    }
}