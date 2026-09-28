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

public class Main {
    public static void main(String[] args) {
        Racer racer1 = new Racer(1);
        racer1.start(); 
    }
}

```

---

