package filosofos.eParcial;

public class Silla {//representa un tipo de turno
    private int slibre=8; //representa el valor de los filosofos, pero con un valor menos. Aquí se representa el caso con que el numero es 10 pero 
    //siempre tendría que ceder para que el otro no muera de hambre 

    public synchronized void qSilla(int i) throws InterruptedException{
        while (slibre==0)// si no hay ningun filososo
            wait();
        System.out.println("Filosofo " +i+ "se sienta en la silla");
        slibre--;
    }

    public synchronized void sSilla(int i) {
        slibre++;//recorre hasta que se pare
        System.out.println("Filosofo " +i+ "se para de la silla ");
        notify();

    }
}
