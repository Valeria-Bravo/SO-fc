package filosofos;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Silla s=new Silla();
        Tenedor[] tenedores=new Tenedor[5];
        for(int i=0;i<tenedores.length;i++) {
            tenedores[i]=new Tenedor(i);
        }
        Filosofos[] filosofos=new Filosofos[5];
        for(int i=0;i<filosofos.length;i++) {
            filosofos[i]=new Filosofos(i,tenedores[i],tenedores[(i+1)%5],s);
            
        }
        for(int i=0;i<filosofos.length;i++){
            filosofos[i].start();
        }

    }
}