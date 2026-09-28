public class Deposito {
    private int items = 0;
    private final int capacidade = 100;

    public int getNumItens() {
        return items;
    }

     public synchronized boolean retirar() {
        if (getNumItens() > 0) {
            items = getNumItens() - 1;
            return true;
        }
        return false;     }

    public synchronized boolean colocar() {
        if (getNumItens() < capacidade) {
            items = getNumItens() + 1;
            return true;
        }
        return false;
    }

    public static void Qt2C(String[] args) {
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

