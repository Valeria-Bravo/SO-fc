package filosofos01;

public class Filosofos extends Thread{
    private int id;
    private Tenedor izda,drcha; 
    private Turno t;
    public Filosofos(int id,Tenedor izda,Tenedor drcha,Turno t){
        this.id=id;
        this.izda=izda;
        this.drcha=drcha;
        this.t=t;
    }

    public void run() {
        while(true) {
            try {
                t.qTurno(id);
                izda.qTenedor(id);
                drcha.qTenedor(id);
                izda.sTenedor(id);
                drcha.sTenedor(id);
                t.sTurno(id);
            } catch (InterruptedException e) { 
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        }

    }
}