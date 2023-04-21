package bolas;

public class Main {

	public static void main(String[] args) {
		
	Bola bola1 = new Bola(1,"Amarilla");
	Bola bola3 = new Bola(3,"Roja");
	Bola bola6 = new Bola(6,"Verde");
	Bola bola8 = new Bola(8,"Negra");
	Bola bola12 = new Bola(12,"Franja violeta");
	Bola bola13 = new Bola(13,"Franja naranja");

	Bola.suma(bola1, bola8);
	Bola.suma(bola12, bola3);
	Bola.suma(bola6, bola13);
	bola13.color();
	}

}
