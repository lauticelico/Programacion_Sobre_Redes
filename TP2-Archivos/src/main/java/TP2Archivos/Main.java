package TP2Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

//               CONSIGNAS:
// Menu de opciones con opcion de salir
// Metodo que perimta leer texto de la consola y devolverlo
// Metodo que verifique si un texto es un numero y lo devuelva (int o float)
// Dar opcion al usuario de agregar 1 producto y pedirle:
//    - nombre de producto
//    - precio compra y precio de venta   (verificar con metodo si es numero y convertirlo en numero con el metodo)
//    - stock actual
// Armar un metodo que crea un archivo de texto (datos.dat)
// Guardar los datos del producto ingresados en un renglon por producto (los datos en el renglon se separan (;) )
// Armar un metodo que muestre en la consola de forma ordenada los datos guardados en el archivo

public class Main {
	static PrintStream ps = new PrintStream(System.out);
	static boolean continuar = true;
	

	public static void main(String[] args) {
		
		Ficheros ficheros = new Ficheros();
		
		
		while (continuar) { //Menú
			ps.println("Ingrese la opción a ejecutar:");
			ps.println("1- Agregar producto");
			ps.println("2- Mostrar produco");
			ps.println("3- Salir");

			int opcion = PUNTO1_leerOpcion();

			switch (opcion) {
			case 1:
				ps.println("Ejecutando Agregar producto");
				Metodos.PUNTO5_productos();
				continuar = true;
				break;
			case 2:
				ps.println("Ejecutando Mostrar producto");
				// Lógica demostarr ultimo producto ingresado (b)
				Ficheros.mostrarProductos();
				continuar = true;
				break;
			case 3:
				ps.println("Saliendo...");
				continuar = false;
				break;
			default:
				ps.println("Opción inválida. Por favor, ingrese una opción válida.");
				break;
			}				
		}
	}
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	static int PUNTO1_leerOpcion() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int opcion = 0;
		boolean entradaValida = false;

		while (!entradaValida) {
			ps.println("Ingrese la opción:");
			try {
				String input = reader.readLine();
				opcion = Integer.parseInt(input);

				if (opcion >= 0) {
					entradaValida = true;
				} else {
					ps.println("Error: Por favor, ingrese un número entero positivo.");
				}
			} catch (NumberFormatException | IOException e) {
				ps.println("Error: Por favor, ingrese un número entero válido.");
			}
		}

		return opcion;
	}

}
