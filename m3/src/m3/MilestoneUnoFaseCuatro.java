package m3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MilestoneUnoFaseCuatro {

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
			
			//ArrayList<String> arrayCiutatsModificades = new ArrayList<String>();			
			
			String [][] newArray = new String[arrayCiudades.size()][];
			
			for(int j = 0;j < arrayCiudades.size();j++){	    
			    int p = arrayCiudades.get(j).length(); 
			    newArray[j] = new String[p];
			    String n = arrayCiudades.get(j);
			    for(int q = 0;q < p;q++){		    
			        var letra = n.charAt(q);
			        newArray[j][q] = String.valueOf(letra);
			    }		    
			}
			
			for (var elemento : newArray){
				System.out.print("\n"); 
				for (int i = 0; i < elemento.length; i++) {  
			        System.out.print(elemento[i]);  
			    } 
				System.out.print(" - ");
				for (int i = elemento.length-1; i >= 0; i--) {  
			         System.out.print(elemento[i]);  
			    }  
			}
			
		}
	}
}
