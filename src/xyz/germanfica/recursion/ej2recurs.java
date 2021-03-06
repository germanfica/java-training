package xyz.germanfica.recursion;

/**
 * Calcular la potencia de un numero m de forma recursiva
 * sin usar el operador "*"
 * @author germa
 *
 */
public class ej2recurs {
	/**
	 * 
	 * @param m es un num cualquiera
	 * @param n es un num cualquiera
	 * @return devuelve el producto entre m y n
	 */
	public static int producto(int m, int n) {
		int op = 0, i;
		for(i=0;i<n;i++) {
			op = op+m;
		}
		return op;
	}
	
	public static int potencia(int m, int n) {
		// Declaración de variables
		int op, aux;
		
		// Inicialización de variables
		op=m;
		aux=m;
		
		// Sea m=9 entonces
		// Se suma 9 veces 9 si 9*9
		// Se suma (9*9) veces 9 si es 9*9*9
		// Se suma (9*9*9) veces 9 si es 9*9*9*9
		// Se suma (9*9*9*9) veces 9 si es 9*9*9*9*9
		// ...
		
		for (int i = 1; i < n; i++) {
			op=producto(m,aux);
			aux=op;
		}
	
		return op;
	}
	
	public static void main(String[] args) {
		System.out.println(potencia(9,4));
	}
}
