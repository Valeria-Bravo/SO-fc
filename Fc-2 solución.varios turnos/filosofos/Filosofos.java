package filosofos;

public class Filosofos extends Thread{
    private int id;
    private Tenedor izda,drcha;
    private Silla s;
    public Filosofos(int id,Tenedor izda,Tenedor drcha,Silla s){
        this.id=id;
        this.izda=izda;
        this.drcha=drcha;
        this.s=s;
    }

    public void run() {
        while(true) {
            //comer///SURROUND WITH CATCH
            try {
                s.qSilla(id);
                izda.qTenedor(id);
                drcha.qTenedor(id);
                izda.sTenedor(id);
                drcha.sTenedor(id);
                s.sSilla(id);
            } catch (InterruptedException e) { 
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        }

    }
}