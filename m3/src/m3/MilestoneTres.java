package m3;

import java.util.Scanner;

public class MilestoneTres {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);		
		
		
		System.out.print("Introduce el número para iniciar la serie Fibonacci: ");
		
		int numeroIntroducido = numero.nextInt();
		int primero = 0, segundo = 1, tercero;		
		
		for (int i = 0; i < numeroIntroducido; ++i) {			
			System.out.print(primero + ",");
			tercero = primero + segundo;
			primero = segundo;
			segundo = tercero;						
		}		
		
	}
}
