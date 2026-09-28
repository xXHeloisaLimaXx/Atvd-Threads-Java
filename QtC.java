class Racer extends Thread {
    private int id;

    public Racer(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Corredor " + id + " iniciou a corrida.");
        System.out.println("Corredor " + id + " cruzou a linha de chegada!");
    }
}

public class QtC {
    public static void QtC(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Racer racer = new Racer(i);
            racer.start();
        }
    }
}
