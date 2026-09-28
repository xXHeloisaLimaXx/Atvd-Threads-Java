private int id;

    public Racer(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Corredor " + id + " iniciou a corrida.");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Corredor " + id + " cruzou a linha de chegada!");
    }
}

public class Qt1D {
    public static void Qt1D(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Racer racer = new Racer(i);
            racer.start();
        }
    }
}

