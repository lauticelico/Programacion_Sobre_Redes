package TP2Archivos;

import java.io.BufferedReader;
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




public class main {
	
	static PrintStream ps = new PrintStream(System.out);
	static boolean continuar = true;

	public static void main(String[] args) {
		
			while (continuar) {
				ps.println("Ingrese la opción a ejecutar:");
				ps.println("1- Ejercicio 1 (a)");
				ps.println("2- Ejercicio 1 (b)");
				ps.println("3- Ejercicio 2");
				ps.println("0- Salir");

				int opcion = main.leerOpcion();

				switch (opcion) {
				case 1:
					ps.println("Ejecutando Ejercicio 1 (a)");
					// Lógica del ejercicio 1 (1)
						// aca llamar al metodo que resuelve el ejercicio
						// el metodo esta en otra Class y recominedo que el metodo sea
						// de tipo Static, asi no hay que Instanciarlo (crear el objeto)
					break;
				case 2:
					ps.println("Ejecutando Ejercicio 1 (b)");
					// Lógica del ejercicio 1 (b)
					break;
				case 3:
					ps.println("Ejecutando Ejercicio 2");
					// Lógica del ejercicio 2
					break;
				case 0:
					ps.println("Saliendo del menú...");
					continuar = false;
					break;
				default:
					ps.println("Opción inválida. Por favor, ingrese una opción válida.");
					break;
				}
			}
		}

	    static int leerOpcion() {
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
	    
	    static String leerDatos() {
	    	String cadena = "";
	    	try {
	    		int Byte = -1;
	    		while((Byte = System.in.read()) != '\n') {
	    			if(Byte != 13)
	    				cadena += (char)Byte;
	    		}
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
	    	return cadena;
	    }
	    
	    static String leerDatosYDevolver_1() {
	    	ps.println ("Ingrese texto: ");
	    	String texto_teclado = leerDatos();
	    	return texto_teclado;
	    }
	    
	    static float verificarFloat_2() {
	    	ps.println ("Ingrese texto a verificar: ");
	    	String texto = leerDatos();
	    	
	    	String numeros = "";
	    	for (int i = 0; i < texto.length(); i++) {
	            if (texto.charAt(i) == '') {
	                
	            }
	    	}
	    	
	    	
	    }
	    

}
