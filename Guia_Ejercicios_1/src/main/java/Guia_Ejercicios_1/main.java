package Guia_Ejercicios_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class main {

	public static void main(String[] args) {
		PrintStream ps = new PrintStream (System.out);
		boolean continuar = true;
		
		// --------------------------------------------------------------------------------PUNTO 1----------------------------------------------------------------------------------------------------------


		//
		//ps.println(Ejercicios.ejercicioD());
		//ps.println(Ejercicios.ejercicioE());
		//ps.println(Ejercicios.ejercicioF());
		//ps.println(Ejercicios.ejercicioG());
		
		// --------------------------------------------------------------------------------PUNTO 2----------------------------------------------------------------------------------------------------------
		
		//ps.println(Ejercicios.ejercicioA2());
		//ps.println(Ejercicios.ejercicioB2());
		//ps.println(Ejercicios.ejercicioC2());
		//ps.println(Ejercicios.ejercicioD2());
		//ps.println(Ejercicios.ejercicioE2());
		//ps.println(Ejercicios.ejercicioF2());
		//Ejercicios.ejercicioG2();
		
		// --------------------------------------------------------------------------------PUNTO 3----------------------------------------------------------------------------------------------------------

		 //Ejercicios.ejercicioA3();
		 //Ejercicios.ejercicioB3();
		//Ejercicios.ejercicioC3();
		//Ejercicios.ejercicioD3();
		//Ejercicios.ejercicioE3();
		Ejercicios.ejercicioF3();
		
		while (continuar) {
			 ps.println("Ingrese la opción a ejecutar:");
			    ps.println("1- Ejercicio 1 (a)");
			    ps.println("2- Ejercicio 1 (b)");
			    ps.println("3- Ejercicio 1 (c)");
			    ps.println("4- Ejercicio 1 (d)");
			    ps.println("5- Ejercicio 1 (e)");
			    ps.println("6- Ejercicio 1 (f)");
			    ps.println("7- Ejercicio 1 (g)");
			    ps.println("8- Ejercicio 2 (a)");
			    ps.println("9- Ejercicio 2 (b)");
			    ps.println("10- Ejercicio 2 (c)");
			    ps.println("11- Ejercicio 2 (d)");
			    ps.println("12- Ejercicio 2 (e)");
			    ps.println("13- Ejercicio 2 (f)");
			    ps.println("14- Ejercicio 2 (g)");
			    ps.println("15- Ejercicio 2 (h)");
			    ps.println("16- Ejercicio 3 (a)");
			    ps.println("17- Ejercicio 3 (b)");
			    ps.println("18- Ejercicio 3 (c)");
			    ps.println("19- Ejercicio 3 (d)");
			    ps.println("20- Ejercicio 3 (e)");
			    ps.println("21- Ejercicio 3 (f)");
			    ps.println("22- Ejercicio 3 (g)");
			    ps.println("0- Salir");

			int opcion = main.leerOpcion();

			switch (opcion) {
			case 1:
				ps.println("Ejecutando Ejercicio 1 (a)");
				ps.println(Ejercicios.ejercicioA());
				break;
			case 2:
				ps.println("Ejecutando Ejercicio 1 (b)");
				ps.println(Ejercicios.ejercicioB());
				break;
			case 3:
				ps.println("Ejecutando Ejercicio 1 (c)");
				ps.println(Ejercicios.ejercicioC());
				break;
			case 4:
				ps.println("Ejecutando Ejercicio 1 (d)");
				ps.println(Ejercicios.ejercicioD());
				break;
			case 5:
				ps.println("Ejecutando Ejercicio 1 (e)");
				ps.println(Ejercicios.ejercicioE());
				break;
			case 6:
				ps.println("Ejecutando Ejercicio 1 (f)");
				ps.println(Ejercicios.ejercicioF());	
				break;
			case 7:
				ps.println("Ejecutando Ejercicio 1 (g)");
				ps.println(Ejercicios.ejercicioG());
				break;
			case 8:
				ps.println("Ejecutando Ejercicio 2 (a)");
				ps.println(Ejercicios.ejercicioA2());
				break;
			case 9:
				ps.println("Ejecutando Ejercicio 2 (b)");
				ps.println(Ejercicios.ejercicioB2());
				break;
			case 10:
				ps.println("Ejecutando Ejercicio 2 (c)");
				ps.println(Ejercicios.ejercicioC2());
				break;
			case 11:
				ps.println("Ejecutando Ejercicio 2 (d)");
				ps.println(Ejercicios.ejercicioD2());
				break;
			case 12:
				ps.println("Ejecutando Ejercicio 2 (e)");
				ps.println(Ejercicios.ejercicioE2());
				break;
			case 13:
				ps.println("Ejecutando Ejercicio 2 (f)");
				ps.println(Ejercicios.ejercicioF2());
				break;
			case 14:
				ps.println("Ejecutando Ejercicio 2 (g)");
				Ejercicios.ejercicioG2();
				break;
			case 15:
				ps.println("Ejecutando Ejercicio 2 (h)");
				Ejercicios.ejercicioH2();
				break;
			case 16:
				ps.println("Ejecutando Ejercicio 3 (a)");
				Ejercicios.ejercicioA3();
				break;	
			case 17:
				ps.println("Ejecutando Ejercicio 3 (b)");
				Ejercicios.ejercicioB3();
				break;	
			case 18:
				ps.println("Ejecutando Ejercicio 3 (c)");
				Ejercicios.ejercicioC3();
				break;
			case 19:
				ps.println("Ejecutando Ejercicio 3 (d)");
				Ejercicios.ejercicioD3();
				break;
			case 20:
				ps.println("Ejecutando Ejercicio 3 (e)");
				Ejercicios.ejercicioE3();
				break;
			case 21:
				ps.println("Ejecutando Ejercicio 3 (f)");
				Ejercicios.ejercicioF3();
				break;
			case 22:
				ps.println("Ejecutando Ejercicio 3 (g)");
				Ejercicios.ejercicioG3();
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
        PrintStream pss = new PrintStream(System.out);
        int opcion = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
        	pss.println("Ingrese la opción:");
            try {
                String input = reader.readLine(); 
                opcion = Integer.parseInt(input); 
                
                if (opcion >= 0) {
                    entradaValida = true; 
                } else {
                	pss.println("Error: Por favor, ingrese un número entero positivo.");
                }
            } catch (NumberFormatException | IOException e) {
            	pss.println("Error: Por favor, ingrese un número entero válido.");
            }
        }

        return opcion;
    }
}
