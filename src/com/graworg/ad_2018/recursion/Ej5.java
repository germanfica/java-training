package com.graworg.ad_2018.recursion;

public class Ej5 {
	
	/**
	 * Retorna el mayor número de un vector
	 * @param vector
	 * @param i
	 * @return
	 */
	// No funciona si no envio como parámetro al númeroMayor
	public static int esMayor(int[] vector, int i, int númeroMayor){
		if(i<2){
			if(vector[i]>númeroMayor){
				// Caso base
				númeroMayor = vector[i];
			}
			// Caso recursivo
			númeroMayor = esMayor(vector, i+1, númeroMayor);
		}
		return númeroMayor;
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		int[] vector = new int[2];
		
		// Inicialización de variables
		vector[0] = 2;
		vector[1] = 12;
		
		System.out.println("El mayor de todos es " + esMayor(vector, 0, vector[0]) + ".");
	}
}
