package filosofos.eParcial;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Silla s=new Silla();
        Tenedor[] tenedores=new Tenedor[9]; 
        //se le asigna un numero a los tenedores para iniciar el proceso
        for(int i=0;i<tenedores.length;i++) {
        //contador para recorrer los tenedores
            tenedores[i]=new Tenedor(i);
        }
        Filosofos[] filosofos=new Filosofos[9];
        // se le asigna un numero de filosofos para iniciar el proceso
        for(int i=0;i<filosofos.length;i++) {
        //contador para recorrer los filosofos
            filosofos[i]=new Filosofos(i,tenedores[i],tenedores[(i+1)%5],s);
            
        }
        for(int i=0;i<filosofos.length;i++){
        // contador para el proceso en general
            filosofos[i].start();
        }

    }
}