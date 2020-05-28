package filosofos.eParcial;

public class Tenedor {
    private int id; //numero de filosofos 
    private boolean libre=true; //el valor de libre siempre sera verdadero

    public Tenedor(int id){
        this.id=id;
    }
    public synchronized void qTenedor(int i) throws InterruptedException{
        while(!libre) 
            wait();//el tenedor se encuentra en uso 
        System.out.println("Filosofo"+i+ "tiene el tenedor"+id);
        libre=false;//posee el numero valor
    } 
    public synchronized void sTenedor(int i) {
        libre=true;//el tenedor esta libre
        System.out.println("Filosofo"+i+ "suelta el tenedor"+id);
        notify(); //permite pasar a la siguiente accion
    }

}

