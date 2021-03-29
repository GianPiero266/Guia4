package Guia4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer [] numero = new Integer[5];
		
		System.out.println("Ingreso de números");
		System.out.println("------------------");
		
		for (int x = 0; x < numero.length; x++) {
		     System.out.println("Número " + (x+1) + ": ");
		     numero[x] = sc.nextInt();
	 }
     
		Arrays.sort(numero);
		
		System.out.println("Números ordenados ascendentemente");
		System.out.println("---------------------------------");
		for (int x =0; x < numero.length; x++)
			System.out.println("Número " + (x+1) + ": " + numero[x]);
		
		Arrays.sort(numero, Collections.reverseOrder());
		
		System.out.println("Números ordenados ascendentemente");
		System.out.println("---------------------------------");
		for (int x =0; x < numero.length; x++)
			System.out.println("Número " + (x+1) + ": " + numero[x]);
		
   }
}