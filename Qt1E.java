class Racer extends Thread {
    private int id;

    public Racer(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Corredor " + id + " (Prioridade " + getPriority() + ") iniciou.");
        System.out.println("Corredor " + id + " cruzou a linha de chegada!");
    }
}

public class Qt1E {
    public static void Qt1E(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Racer racer = new Racer(i);
                    racer.setPriority(i); 
            racer.start();
        }
    }
}
