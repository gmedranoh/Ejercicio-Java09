import java.util.Scanner;
public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Operadores lógicos
		 * a == b a es igual a b
		 * a > b a es mayor a b
		 * a < b a es menor a b
		 * a != b a es diferente a b
		 * */
		
		Scanner leer = new Scanner(System.in);		
		System.out.println("¿Cual es tu nombre?");
		String nombre = leer.nextLine();
		System.out.println(saludo(nombre));
		
		leer.close();

	}
	
	public static String saludo(String saludo) {

		return "hola, " + saludo;
	}

}
