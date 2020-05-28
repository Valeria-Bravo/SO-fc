package filosofos.eParcial;
package filosofos.deadlock;
public class Filosofos extends Thread{ 
    private int id; //numero de filosofos
    private Tenedor izda,drcha;//posicion del filosofo
    public Filosofos(int id,Tenedor izda,Tenedor drcha){
        this.id=id;
        this.izda=izda;
        this.drcha=drcha;
    }
    public void run() {
        while(true) {
            //comer///SURROUND WITH CATCH
            try {// condicional, si come..., se desencadena 
            	//para que se pueda realizar su acción   
       
                izda.qTenedor(id);
                drcha.qTenedor(id);
                izda.sTenedor(id);
                drcha.sTenedor(id);
            } catch (InterruptedException e) { 
                // TODO Auto-generated catch block
                e.printStackTrace();//por defecto
            }

        }

    }
}
