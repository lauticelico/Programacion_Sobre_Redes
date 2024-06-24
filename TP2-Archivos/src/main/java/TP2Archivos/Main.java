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
		
		Metodos.PUNTO3_verificarTipoDato();
		Ficheros ficheros = new Ficheros();
		//menu();
		
	}
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	static void menu() {
		while (continuar) { //Menú

			ps.println(Utils.ANSI_YELLOW_BACKGROUND + Utils.ANSI_BLACK + "Ingrese la opción a ejecutar:" + Utils.ANSI_RESET);
			ps.println();
			ps.println(Utils.ANSI_GREEN_BACKGROUND + Utils.ANSI_BLACK + "1" + Utils.ANSI_RESET + Utils.ANSI_GREEN_BOLD + " Agregar producto" + Utils.ANSI_RESET);
			ps.println(Utils.ANSI_GREEN_BACKGROUND + Utils.ANSI_BLACK + "2" + Utils.ANSI_RESET + Utils.ANSI_GREEN_BOLD +  " Mostrar producto"+ Utils.ANSI_RESET);
			ps.println(Utils.ANSI_RED_BACKGROUND + Utils.ANSI_BLACK + "3" + Utils.ANSI_RESET + Utils.ANSI_RED_BOLD + " Salir" + Utils.ANSI_RESET);
			ps.println();
			int opcion = PUNTO1_leerOpcion();

			switch (opcion) {
			case 1:
				ps.println();
				ps.println("Ejecutando Agregar producto...");
				ps.println();
				Metodos.PUNTO5_productos();
				continuar = true;
				break;
			case 2:
				ps.println();
				ps.println("Ejecutando Mostrar producto...");
				ps.println();
				// Lógica demostarr ultimo producto ingresado (b)
				Ficheros.mostrarProductos();
				continuar = true;
				break;
			case 3:
				ps.println();
				ps.println("Saliendo...");
				continuar = false;
				break;
			default:
				ps.println();
				ps.println("Opción inválida. Por favor, ingrese una opción válida.");
				break;
			}	
		}	
	}
	
	static int PUNTO1_leerOpcion() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int opcion = 0;
		boolean entradaValida = false;

		while (!entradaValida) {
			ps.println(Utils.ANSI_YELLOW + "Ingrese la opción:" + Utils.ANSI_RESET);
			try {
				String input = reader.readLine();
				opcion = Integer.parseInt(input);

				if (opcion >= 0) {
					entradaValida = true;
				} else {
					ps.println();
					ps.println("Error: Por favor, ingrese un número entero positivo.");
				}
			} catch (NumberFormatException | IOException e) {
				ps.println();
				ps.println("Error: Por favor, ingrese un número entero válido.");
			}
		}
		return opcion;
	}

}
