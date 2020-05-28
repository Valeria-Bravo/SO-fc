
package filosofos01;

public class Filosofos extends Thread{
    int eat;
    private int id; //numero de filosofos 
    private Tenedor izda,drcha; //posicion del tenedor 
    private Turno t;
    public Filosofos(int id,Tenedor izda,Tenedor drcha,Turno t){
    	this.eat = 10000; //valor de fideos
        this.id=id;
        this.izda=izda;
        this.drcha=drcha;
        this.t=t;
    }
    public void run() {
        while(true) {
            //comer///SURROUND WITH CATCH
            try {
                t.qTurno(id);
                drcha.qTenedor(id);
                izda.qTenedor(id);

                System.out.println( "Filosofo "+this.getName() + " comiendo, queda " + this.eat + " fideos ");
                eat=eat-10;
                if(eat==0) {
                    System.out.println(this.getName() + "los filosofos murieron de hambre ");
                    System.exit(0);
                }
                drcha.sTenedor(id);
                izda.sTenedor(id);
                t.sTurno(id);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}