class Racer implements Runnable {
    private int i;

    public Racer(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Racer " + i + " – imprimindo");
           
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Qtforma2 {
    public static void Qtforma2(String[] args) {
              Racer racerRunnable = new Racer(2);
        
        Thread thread = new Thread(racerRunnable);
        
        thread.start();
    }
}

``` 
