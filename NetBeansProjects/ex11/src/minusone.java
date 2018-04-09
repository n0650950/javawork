public class minusone implements Runnable{
    ex11 e;
    minusone(ex11 _e){
        e = _e;
    }
    
        public void run() {
            while(e.number > 0){
                try{
                e.decrement();
                Thread.sleep(50);
                }catch(InterruptedException e) {}
            }
        }
}