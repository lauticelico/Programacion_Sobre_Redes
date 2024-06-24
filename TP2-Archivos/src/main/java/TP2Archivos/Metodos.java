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
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	static String PUNTO2_leerDatosYDevolver() {
		ps.println("Ingrese texto: ");
		String texto_teclado = PUNTO2_leerDatos();
		return texto_teclado;
	}
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
    
		 static String PUNTO3_verificarTipoDato() {
			   ps.println("Ingrese el texto a identificar: ");
			   String dato = PUNTO2_leerDatos();
			   boolean conPunto = false;
			   boolean esNumero = true;

			   for (int i = 0; i < dato.length(); i++) {
			       char caracter = dato.charAt(i);
			       if (caracter >= '0' && caracter <= '9') {
			           continue;
			       } else if ((caracter == '.' || caracter == ',') && !conPunto) {
			    	   conPunto = true;
			       } else {
			           esNumero = false;
			           break;
			       }
			   }

			   if (esNumero) {
			       if (conPunto) {
			           return "Es un número con coma.";
			       } else {
			           return "Es un número entero.";
			       }
			   } else {
			       return "Es un texto.";
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
	 
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------	

		static void PUNTO5_productos() { // Pedirle al usuario que ingrese: Nombre de producto, Precio de Compra, Precio de Venta y Stock

			ps.println();
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

		public static void PUNTO7_agregarAlArchivo(String nombre, float precio_compra, float precio_venta,
				int cant_stock) {
			
			Ficheros.ps.println("Nombre del producto: " + nombre);
			Ficheros.ps.println("Precio de compra: " + precio_compra);
			Ficheros.ps.println("Precio de venta: " + precio_venta);
			Ficheros.ps.println("Stock: " + cant_stock);
			ps.println();
			Ficheros.ps.flush();

		}
	 
	 
	 
	 
	 
	 
}
