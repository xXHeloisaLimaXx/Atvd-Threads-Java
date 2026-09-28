class Deposito {
    private int items = 0;
    private final int capacidade = 100;

    public int getNumItens() {
        return items;
    }

    public synchronized boolean retirar() {
        if (items > 0) {
            items = items - 1;
            return true;
        }
        return false;
    }

    public synchronized boolean colocar() {
        if (items < capacidade) {
            items = items + 1;
            return true;
        }
        return false;
    }
}

class Produtor extends Thread {
    private Deposito deposito;
    private int tempoEspera;

    public Produtor(Deposito deposito, int tempoEspera) {
        this.deposito = deposito;
        this.tempoEspera = tempoEspera;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            deposito.colocar();
            try {
                Thread.sleep(tempoEspera);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumidor extends Thread {
    private Deposito deposito;
    private int tempoEspera;

    public Consumidor(Deposito deposito, int tempoEspera) {
        this.deposito = deposito;
        this.tempoEspera = tempoEspera;
    }

    @Override
    public void run() {
        int caixasRetiradas = 0;

        while (caixasRetiradas < 20) {
            if (deposito.retirar()) {
                caixasRetiradas++;
                try {
                    Thread.sleep(tempoEspera);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                               try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
public class Qt3A {
    public static void Qt3A(String[] args) {
        Deposito dep = new Deposito();
        Produtor p = new Produtor(dep, 50);
        Consumidor c1 = new Consumidor(dep, 150);
        Consumidor c2 = new Consumidor(dep, 100);
        Consumidor c3 = new Consumidor(dep, 150);
        Consumidor c4 = new Consumidor(dep, 100);
        Consumidor c5 = new Consumidor(dep, 150);

        p.start();
        c1.start(); c2.start(); c3.start();
        c4.start(); c5.start();

        System.out.println("Execucao do main da classe Deposito terminada");
    }
}

