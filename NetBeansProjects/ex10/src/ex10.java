public class ex10 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DisplayEven(2, 100));
        Thread t2 = new Thread(new DisplayOdd(1, 100));
        t1.start();
        t2.start();
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("main thread");
                Thread.sleep(80);
            } catch (InterruptedException e) {}
        }
    }
}