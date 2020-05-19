package filosofos;

public class Tenedor {
    private int id; 
    private boolean libre=true;

    public Tenedor(int id){
        this.id=id;
    }
    public synchronized void qTenedor(int i) throws InterruptedException{
        while(!libre)
            wait();
        System.out.println("Filosofo"+i+ "tiene el tenedor"+id);
        libre=false;
    } 
    public synchronized void sTenedor(int i) {
        libre=true;
        System.out.println("Filosofo"+i+ "suelta el tenedor"+id);
        notify(); 
    }

}