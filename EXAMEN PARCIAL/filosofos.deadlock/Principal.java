package filosofos.deadlock;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Tenedor[] tenedores=new Tenedor[4];
        for(int i=0;i<tenedores.length;i++) {
            tenedores[i]=new Tenedor(i);
        }
        Filosofos[] filosofos=new Filosofos[4];
        for(int i=0;i<filosofos.length;i++) {
            filosofos[i]=new Filosofos(i,tenedores[i],tenedores[(i+1)%5]);
            
        }
        for(int i=0;i<filosofos.length;i++){
            filosofos[i].start();
        }

    }
}