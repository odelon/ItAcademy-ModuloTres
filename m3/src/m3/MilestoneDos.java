package m3;

import java.io.IOException;
import javax.swing.JOptionPane;

public class MilestoneDos {

	public static void main(String[] args) throws IOException {
			
	  /*String nota = JOptionPane.showInputDialog("Introduce la nota del alumno entre 0 y 10");		
		Scanner medias = new Scanner(System.in);*/       
        
        double notas[][] = new double[2][4];        

        for (int i = 0; i < notas.length; i++) {
        	String alumnoS = JOptionPane.showInputDialog("Introduce el ID del alumn@");
        	notas[i][0] = Integer.parseInt(alumnoS);    	 
             for (int j = 1; j < notas[i].length; j++) {
            		String notaS = JOptionPane.showInputDialog("Introduce la nota del alumn@ del 0 al 10");
            		notas[i][j] = Double.parseDouble(notaS);
            	}
        }
        
        for (int x=0; x < notas.length; x++){
          double suma = 0;
          double media = 0;
          
            for (int y=1; y < notas[x].length; y++) {
            	suma += notas[x][y];                   
            }
   
          media = (suma/((notas[x].length)-1));
            
          if (media >= 5) {
            	System.out.println("la media del alumno con ID " + notas[x][0] + " es " + media + " y por lo tanto ha aprobado.");
          } else {
            	System.out.println("la media del alumno con ID " + notas[x][0] + " es " + media + " y por lo tanto ha suspendido.");
          }     
        }       
        
	}
}
        
        
       
