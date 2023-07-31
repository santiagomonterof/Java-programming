package logica;

public class Consola {

	public static void main(String[] args) {
		//Archivo arc=new Archivo();

		/*arc.escribir("prueba.txt", "jugador1=player1",true);
		arc.escribir("prueba.txt", "color=#FFF000",false);
		arc.escribir("prueba.txt", "posX=15",false);*/

		Archivo.escribir("prueba.txt", "posX=15",false);
		Archivo.leer("prueba.txt");
	}

}
