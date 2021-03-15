package m3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MilestoneUnoFaseDos {

	public static void main(String[] args) {
		
		try (Scanner ciudades = new Scanner(System.in)) {
			System.out.println("Introduce el nombre de seis ciudades:");
			
			String ciudadUno = ciudades.nextLine();
			String ciudadDos = ciudades.nextLine();
			String ciudadTres = ciudades.nextLine();
			String ciudadCuatro = ciudades.nextLine();
			String ciudadCinco = ciudades.nextLine();
			String ciudadSeis = ciudades.nextLine();		
			
			ArrayList<String> arrayCiudades = new ArrayList<String>();
			arrayCiudades.add(ciudadUno);
			arrayCiudades.add(ciudadDos);
			arrayCiudades.add(ciudadTres);
			arrayCiudades.add(ciudadCuatro);
			arrayCiudades.add(ciudadCinco);
			arrayCiudades.add(ciudadSeis);
			
			Collections.sort(arrayCiudades);
			
				for (String todasCiudades: arrayCiudades) {
				System.out.println(todasCiudades);
				}
		}

	}
}
