package filosofos.eParcial;
public class Filosofos extends Thread{
	private int id;//numero de filosofos
	private Tenedor izda,drcha;//posicion del filosofo
	private Silla s;
	int stomach;//declarando "stomach"
	int plato_fideo;//declarando "plato_fideo"
	public Filosofos(int id,Tenedor izda,Tenedor drcha,Silla s){
		//constructor
		this.id=id;
		this.izda=izda;
		this.drcha=drcha;
		this.s=s;
		this.stomach =500;//se le asigna un valor
		this.plato_fideo=10000;//se le asigna una valor
	}
	public void run() {
		while(true) {
			//comer///SURROUND WITH CATCH
			try {// condicional, si come..., se desencadena 
	        	//para que se pueda realizar su acción  
				if(stomach>=500) { //condicional de stomach
					System.out.println(this.getName() + "ya no  se puede comer más");
				}
				s.qSilla(id);
				drcha.qTenedor(id);
				izda.qTenedor(id);
				comer();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Se ha producido una excepcion...");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("+Se ha producido una excepcion...");
				}
				plato_comida();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("+Se ha producido una excepcion...");
				}
				if(plato_fideo==0) { //si ya no hay comida
					System.out.println(this.getName() + "ya no hay comida...");
					System.exit(0);
					
				}
				izda.sTenedor(id);
				drcha.sTenedor(id);
				s.sSilla(id);
				long inicio = System.nanoTime();
				pensar();
				long despues = System.nanoTime();
				long tiempo = despues - inicio;
				if(tiempo<=2000) {
					System.out.println(this.getName() + " estoy muy hambriento, muero de hambre");
					System.exit(0);
				}
				if(stomach==0) {// si el estomago llega a 0
					System.out.println(this.getName() + "estoy muy hambriento, muero de hambre");
					System.exit(0);
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void comer() {//accion comer
		long inicio = System.nanoTime();
		this.stomach=stomach +50;//se incrementa el valor de stomach, realiza accion
		long despues = System.nanoTime();
		long tiempo = despues - inicio;
		System.out.println(this.getName() + " estoy comiendo ... " + this.stomach + " me demore "+ tiempo);
		
	}
	
	public void pensar() {//accion pensar
		long inicio = System.nanoTime();
		this.stomach= stomach -30;// se decrementa el valor de stomach, por gasto de energia
		long despues = System.nanoTime();
		long tiempo = despues - inicio;
		System.out.println(this.getName() + " estoy pensando ... " + this.stomach + " me demore "+ tiempo);
	}
	public void plato_comida(){
		this.plato_fideo=plato_fideo-5;
		System.out.println(this.getName() + "mi plato de fideo esta en.... " + this.plato_fideo);
	}
}