class DisplayOdd implements Runnable {
    int from;
    int to;

    public DisplayOdd (int _from, int _to){
        from = _from;
        to = _to;
    }

    public void run(){
        for (int i = from; i < to; i+=2){
            try {
                System.out.println(i);
                Thread.sleep(50);
            } catch (InterruptedException e) {}
        }
    }  
}