package TP2Archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Metodos {
	
	static PrintStream ps = new PrintStream(System.out);
	static boolean continuar = true;
	
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------	

	static String PUNTO2_leerDatos() {
		String cadena = "";
		try {
			int Byte = -1;
			while(    (Byte = System.in.read())  != '\n'    ) 
			{
				if( Byte != 13 )
					cadena += (char)Byte;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return cadena;
	}
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	/*static String leerDatosYDevolver_1() {
		ps.println("Ingrese texto: ");
		String texto_teclado = leerDatos();
		return texto_teclado;
	}*/
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
    
	 static String PUNTO3_verificarTipoDato() {
	        ps.println("Ingrese un dato: ");
	        String dato = PUNTO2_leerDatos();

	        // Intentar convertir a entero
	        try {
	            Integer.parseInt(dato);
	            return "Entero";
	        } catch (NumberFormatException excepcion1) {
	            // Si no se puede convertir a entero, intentar convertir a float
	            try {
	                Float.parseFloat(dato);
	                return "Número con coma (float)";
	            } catch (NumberFormatException excepcion2) {
	                // Si no se puede convertir a float, es un String
	                return "String";
	            }
	        }
	    }
	 
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	 
	 static int PUNTO4_convertirStrAInt(int num) {
	        ps.println("Ingrese texto (con valor numerico entero)");
	        String texto = PUNTO2_leerDatos();
	
	        int numeroEntero = Integer.parseInt(texto);
	        ps.println("El numero " + numeroEntero + " ahora es de tipo entero");
	        return numeroEntero; // Devolver como string el número entero convertido
	        
	    }  
	        
	 static float PUNTO4_convertirStrAFloat() {
	        ps.println("Ingrese texto (con valor numerico con coma)");
	        String texto = PUNTO2_leerDatos();
	
	        float numeroFloat = Float.parseFloat(texto);
	        ps.println("El numero " + numeroFloat + " ahora es de tipo entero");
	        return numeroFloat;
	        
	    } 
	 
	 
	 public static void PUNTO4_convertToAscii() {
	        ps.println("Ingrese la palabra para convertir a ASCII: ");
	        String palabra = PUNTO2_leerDatos();

	        StringBuilder asciiValues = new StringBuilder();

	        for (int i = 0; i < palabra.length(); i++) {
	            char character = palabra.charAt(i);
	            int asciiValue = (int) character;
	            asciiValues.append(asciiValue);

	            if (i < palabra.length() - 1) {
	                asciiValues.append(", ");
	            }
	        }

	        ps.println("La palabra '" + palabra + "' convertida a ASCII es: " + asciiValues.toString());
	    }
	
	 
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------	

	 static void PUNTO5_productos() { //Pedirle al usuario que ingrese: Nombre de producto, Precio de Compra, Precio de Venta y Stock
		 ps.println("Ingrese nombre del producto: ");
		 String nombre = PUNTO2_leerDatos();
		 
		 ps.println("Ingrese precio de compra del producto: ");
		 String dato = PUNTO2_leerDatos();
		 float precio_compra = Float.parseFloat(dato);
		 
		 ps.println("Ingrese precio de venta del producto: ");
		 String dato2 = PUNTO2_leerDatos();
		 float precio_venta = Float.parseFloat(dato2);
		 
		 ps.println("Ingrese stock del producto: ");
		 String dato3 = PUNTO2_leerDatos();
		 int cant_stock = Integer.parseInt(dato3);
		 
		 PUNTO7_agregarAlArchivo(nombre, precio_compra, precio_venta, cant_stock);
		 
	 }
	 
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	 
	 public static void PUNTO7_agregarAlArchivo(String nombre, float precio_compra, float precio_venta, int cant_stock) {
		 	Ficheros.ps.println("Nombre del producto: " + nombre);
	        Ficheros.ps.println("Precio de compra: " + precio_compra);
	        Ficheros.ps.println("Precio de venta: " + precio_venta);
	        Ficheros.ps.println("Stock: " + cant_stock);
	        Ficheros.ps.println();
	        Ficheros.ps.flush();
	        ps.close();
		 
	 }
	 
	 
	 
	 
	 
}
	
	
	
	

