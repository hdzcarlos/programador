/*
 * Realizar la carga de dos números enteros
 *  por teclado e imprimir su suma y su producto.
 */

package com.chc.condicionales;

import java.util.Scanner;

public class sumaYProducto {

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	
	float numero1 = 0f;
	float numero2 = 0f;
	int opcion = 0;
	int opcion1 = 0;
	
	
	
	System.out.println("1: Multiplicar");
	System.out.println("2: Sumar");
	System.out.println("3: otra opcion");
	System.out.print("Introduzca la opcion que desea realizar: ");
	opcion = sc.nextInt();
	
	
//System.out.print("Introduzca el Numero1: ");	
//numero1 = sc.nextFloat();

//System.out.print("Introduzca el Numero2: ");
//numero2 = sc.nextFloat();
// Vamos a mostrar por pantalla la suma de los dos numeros.
//System.out.print("La suma de estos dos numeros es: "+ (numero1 + numero2));

// Ahora vamos a hayar el prducto de los dos numeros 
//System.out.println("El producto de los dos numeros es: " +(numero1 * numero2));

// Ahora vamos a crear una condición para que el usuario elija si quiere sumar o multplicar.


if (opcion == 1){
	
	System.out.print("Introduzca el numero1 ");
	numero1 = sc.nextFloat();
	
	System.out.print("Introduzca el numero2 ");
	numero2 = sc.nextFloat();
	
	System.out.println("El resutado de la multiplicación es: "+ (numero1 * numero2));
	

	System.out.println("¿Desea seguir haciendo operacines? ");
	System.out.println("1: Si");
	System.out.println("2: No");
	System.out.print("->");
	opcion1 = sc.nextInt();
	
	
	}else if (opcion1 == 1);


else if  (opcion == 2) {
	
	System.out.println("Introduzca el numero1: ");
	numero1 = sc.nextFloat();
	
	System.out.print("Introduzca el numero2 ");
	numero2 = sc.nextFloat();
	
	System.out.println("El resultado de la suma es: " +(numero1 + numero2));
	
	}else {
		System.out.println("Introduzca otra opción: ");
		opcion = sc.nextInt();
		
		

		
		
	
		}
	}
}




	
	
	
	



