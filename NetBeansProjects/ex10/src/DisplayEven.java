class DisplayEven implements Runnable {
    int from;
    int to;

    public DisplayEven(int _from, int _to) {
        from = _from;
        to = _to;
    }

    public void run() {
        for (int i = from; i < to; i += 2) {
            try {
                System.out.println(i);
                Thread.sleep(70);
            } catch (InterruptedException e) {}
        }
    }
}