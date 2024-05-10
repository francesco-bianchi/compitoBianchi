package es.compito;

public class Piloti extends Thread{
    Spogliatoio s;
    Pista p;
    public Piloti(String nome, Spogliatoio s, Pista p) {
        super(nome);
        this.s = s;
        this.p = p;
    }

    public void run(){
        int tempS1 = s.cambia();
        try {
            Thread.sleep(tempS1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.esci();

        int tempP = p.corri();
        try {
            Thread.sleep(tempP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p.esci();

        int tempS2 = s.cambia();
        try {
            Thread.sleep(tempS2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.esci();
    }
    
}
