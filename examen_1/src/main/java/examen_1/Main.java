package examen_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
	static PrintStream ps = new PrintStream(System.out);
	static boolean continuar = true;
	
	public static void main(String[] args) {
		
		while (continuar) {
			ps.println("Ingrese la opción a ejecutar:");
			ps.println("1- Agregar");
			ps.println("2- Mostrar");
			ps.println("3- Eliminar");
			ps.println("0- Salir");

			int opcion = Main.leerOpcion();

			switch (opcion) {
			case 1:
				ps.println("1-Agregar datos al archivo");
				// SE EJECUTA AGREGAR DATOS Agrega datos al archivo
				break;
			case 2:
				ps.println("2-Mostrar archivo");
				//SE EJECUTA MOSTRAR DATOS DEL ARCHIVO Datos.mostrarArchivo();
				break;
			case 3:
				ps.println("3-Eliminar datos del archivo");
				//SE EJECUTA ELIMINAR DATOS Datos.eliminarDatos();
				break;
			case 0:
				ps.println("SALISTE");
				// Salir del menu
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
}

