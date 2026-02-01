package pdf2;

// counts 5 to 1 
class CountDown extends Thread {

    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("Count down at " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

// counts 1 to 5
class CountUp implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count up at " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Assignment_08 {

    public static void main(String[] args) {

        Thread t1 = new CountDown();
        Thread t2 = new Thread(new CountUp());

        t1.start();
        t2.start();
    }
}