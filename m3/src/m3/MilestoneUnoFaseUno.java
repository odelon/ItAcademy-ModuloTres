package m3;

import java.util.Scanner;

public class MilestoneUnoFaseUno {

	public static void main(String[] args) {
		
		try (Scanner ciudades = new Scanner(System.in)) {
			System.out.println("Introduce el nombre de las seis ciudades:");
			
			String ciudadUno = ciudades.nextLine();
			String ciudadDos = ciudades.nextLine();
			String ciudadTres = ciudades.nextLine();
			String ciudadCuatro = ciudades.nextLine();
			String ciudadCinco = ciudades.nextLine();
			String ciudadSeis = ciudades.nextLine();
			
			System.out.println("Las ciudades que has escrito son: " + ciudadUno + ", " + ciudadDos + ", " + ciudadTres + ", " + ciudadCuatro + ", " + ciudadCinco + " y " + ciudadSeis);
		}

	}
}
