package filosofos;

public class Silla {
    private int slibre=4; 

    public synchronized void qSilla(int i) throws InterruptedException{
        while (slibre==0)
            wait();
        System.out.println("Filosofo " +i+ "se sienta en la silla");
        slibre--;
    }

    public synchronized void sSilla(int i) {
        slibre++;
        System.out.println("Filosofo " +i+ "se para de la silla ");
        notify();

    }
}
