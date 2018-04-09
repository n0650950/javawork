class ex11 {

    public int number = 100;

    synchronized public void decrement(){
        number--;
        System.out.println("Decrement by one = " + number);
    }

    public static void main(String[] args) {
        ex11 e = new ex11();
        minusone f = new minusone(e);
        minusone g = new minusone(e);
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(g);
        t1.start();
        t2.start();
       
    }
}
