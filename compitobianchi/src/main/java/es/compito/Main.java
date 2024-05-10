package es.compito;

public class Main {
    public static void main(String[] args) {
        Spogliatoio s = new Spogliatoio();
        Pista p= new Pista();

        for(int i=0; i<8; i++){
            Piloti pil = new Piloti("Pilota" + i, s, p);
            pil.start();
        }
    }
}