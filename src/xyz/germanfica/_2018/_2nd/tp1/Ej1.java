package xyz.germanfica._2018._2nd.tp1;

import java.util.Scanner;

import xyz.germanfica.mensaje.Mensaje;

/*
 * ALGORITMO misterio() RETORNA Ø
 * (* Este algoritmo ... *)
 * ENTERO x,y
 * LEER(x)
 * LEER(y)
 * x <- x-y
 * y <- x+y
 * x <- y-x
 * ESCRIBIR ("Los valores de x e y son")
 * ESCRIBIR (x)
 * ESCRIBIR (y)
 * FIN ALGORITMO misterio
 */
public class Ej1 {
	private static Scanner sc;
	
	public static int[] numInvetido(int x, int y) {
		int[] arreglo = new int[2];
		
		// Operaciones
		x = x-y;
		y = x+y;
		x = y-x;
		
		// Almacenar
		arreglo[0] = x;
		arreglo[1] = y;
		
		return arreglo;
	}
	
	/**
	 * El objetivo del algoritmo es dado dos número intercambiar las posiciones (invertir)
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaracion de variables
		int x,y;
		
		// Inicializacion de variables
		x=0;
		y=0;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		// Creacion del Scanner
		sc = new Scanner(System.in);
		
		// Leer
		x = sc.nextInt();
		y = sc.nextInt();
		
		// Dar vuelta los números
		x = x-y;
		y = x+y;
		x = y-x;
		
		
		// Escribir
		System.out.println("Los valores de x e y son");
		System.out.println(x);
		System.out.println(y);
	}
}
