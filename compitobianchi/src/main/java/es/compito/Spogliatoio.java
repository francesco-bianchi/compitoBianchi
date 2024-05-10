package es.compito;

public class Spogliatoio {
    private int persMax =2;

    public synchronized int cambia(){
        String nome = Thread.currentThread().getName();

        try {
            while(persMax==0){
                //System.out.println("Spogliatoio pieno");
                wait();
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        persMax--;
        System.out.println(nome + " entra nello spogliatoio");
        int t= 1000 + (int) (Math.random()*2000);
        return t;
    }

    public synchronized void esci(){
        String nome = Thread.currentThread().getName();
        persMax++;
        System.out.println(nome + " esce dallo spogliatoio");
        notifyAll();
    }
}
