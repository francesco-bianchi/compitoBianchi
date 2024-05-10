package es.compito;

public class Pista {
    private int persEntrate =4;

    public synchronized int corri(){
        String nome = Thread.currentThread().getName();

        try {
            while(persEntrate==0){
                System.out.println("Pista piena");
                wait();
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        persEntrate--;
        System.out.println(nome + " sale sul go-kart");
        int t=4000 + (int) (Math.random()*6000);
        System.out.println(nome + " il pilota occupa la pista per: " + t/1000 + "s");
        return t;
    }

    public synchronized void esci(){
        String nome = Thread.currentThread().getName();
        persEntrate++;
        System.out.println(nome + " esce dalla pista");
        notifyAll();
    }
}
