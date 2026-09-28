class Racer extends Thread {
    private int id;

    public Racer(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Corredor " + id + " - Impressão " + i);
        }
        System.out.println(">>> Corredor " + id + " FINALIZOU a corrida! <<<");
    }
}

public class Qt1f {
    public static void Qt1f(String[] args) {
        Racer[] oddRacers = new Racer[5];
        Racer[] evenRacers = new Racer[5];

        int oddIdx = 0, evenIdx = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                oddRacers[oddIdx++] = new Racer(i);
            } else {
                evenRacers[evenIdx++] = new Racer(i);
            }
        }

        for (Racer racer : oddRacers) {
            racer.start();
        }

        for (Racer racer : oddRacers) {
            try {
                racer.join()            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            for (Racer racer : evenRacers) {
            racer.start();
        }
    }
}

