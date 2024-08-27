package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Ventana {
	public static Scanner sc = new Scanner (System.in);
	
	public static long pedirLong() {
		System.out.println("digite el codigo estudiante");
		long opcion =sc.nextLong();
		return opcion;
	}
	public static String pedirString(String dato) {
		System.out.println(dato);
		String opcion =sc.nextLine();
		return opcion;
	}
	public void mostrarEstudiante(String estudiante) {
		System.out.println(estudiante);
	}
	public static int pedirEntero(String dato) {
		System.out.println(dato);
		int opcion =sc.nextInt();
		return opcion;
	}
}
