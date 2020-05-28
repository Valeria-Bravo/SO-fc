package filosofos01;

public class Turno {
	private int sturno=4; 
    public synchronized void qTurno(int i) throws InterruptedException{
        while (sturno==0)
            wait();
        System.out.println("Filosofo " +i+ "su turno");
        sturno++;
    }

    public synchronized void sTurno(int i) {
        sturno--;
        System.out.println("Filosofo " +i+ "pierde su turno");
        notify();

    }
}
