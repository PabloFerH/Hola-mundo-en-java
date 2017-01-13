/**
*	Muestra en pantalla la frase "¡Hola Mundo!"
*	@author Pablo Fernández Herrera
*/
public class HolaMundo{
	public static void main(String[] args){
		String naranja  = "\033[33m";
		String azul = "\033[34m";

		System.out.println(naranja + "¡Hola mundo!");
		System.out.println(azul + "Aqui estamos haciendo pruebas de Git.");
	}
}
