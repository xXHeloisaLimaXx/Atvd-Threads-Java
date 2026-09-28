class Racer extends Thread {
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

public class Qt1forma1 {
    public static void Qt1forma1(String[] args) {
        Racer racer1 = new Racer(1);
        racer1.start(); 
    }
}

```

---

