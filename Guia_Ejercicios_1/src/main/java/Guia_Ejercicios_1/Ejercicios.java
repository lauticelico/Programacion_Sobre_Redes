package Guia_Ejercicios_1;

import java.io.IOException;
import java.io.PrintStream;
import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.time.*;



public class Ejercicios {
	static PrintStream ps = new PrintStream (System.out);
    static ClassReader reader = new ClassReader();


// -------------------------------------------------------------------------------------PUNTO 1-----------------------------------------------------------------------------------------------------
	static String entradaDeDatos() {
		
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
	
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	static String ejercicioA() {	//Dados el valor de una hora de trabajo y la cantidad de horas trabajadas, la computadora muestra el valor del sueldo bruto.
		ps.println("Ingrese valor por hora de trabajo: ");
		
		String datoLeido = entradaDeDatos(); 
		int horaTra = Integer.parseInt(datoLeido);
		
		ps.println("Ingrese cantidad de horas de trabajo: ");
		String datoLeido2 = entradaDeDatos(); 
		int cantHoras = Integer.parseInt(datoLeido2);
		
		int sueldoBruto = horaTra * cantHoras;
		
		return("El sueldo bruto es de " + "$" + sueldoBruto);
	}
	
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	static String ejercicioB() {	//Dados los valores de dos de los ángulos interiores de un triángulo, la computadora muestra el valor del restante.
		ps.println("Ingrese valor del primer angulo: ");
		
		String datoLeido = entradaDeDatos(); 
		int primerAngulo = Integer.parseInt(datoLeido);
		
		ps.println("Ingrese valor del segundo angulo: ");
		String datoLeido2 = entradaDeDatos(); 
		int segundoAngulo = Integer.parseInt(datoLeido2);
		
		int tercerAngulo = 180 - primerAngulo - segundoAngulo;
		
		int comprobacion = primerAngulo + segundoAngulo + tercerAngulo;
		
		return("El valor del tercer angulo es: " + tercerAngulo + "\n" +  "Comprobacion: \n" + "Primer angulo = " + primerAngulo + "\n" + "Segundo angulo = " + segundoAngulo + "\n" + "Tercer angulo = " + tercerAngulo + "\n" + "Total = " + comprobacion);
	}
	
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	static String ejercicioC() {	//Dada la superficie de un cuadrado (en m2), la computadora muestra su perímetro.
		ps.println("Ingrese valor de la superficie en metros cuadrados: ");
		
		String datoLeido = entradaDeDatos(); 
		double superficie = Double.parseDouble(datoLeido);
		
		double lado =  Math.sqrt(superficie);
		
		double perimetro = 4 * lado;
		
		return("El perimetro del cuadrado es" + perimetro + " metros");
	}
	
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	static String ejercicioD() {	//Dada una temperatura en grados Fahrenheit, la computadora la muestra en grados centígrados.
		ps.println("Ingrese valor de la temperatura en grados Fahrenheit: ");
		
		String datoLeido = entradaDeDatos(); 
		double gradosF = Double.parseDouble(datoLeido);
		
		double gradosC = (gradosF - 32) * 5/9;
		
		return(gradosF + " pasado a grados centigrados es: " + gradosC);
	}
	
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	static String ejercicioE() {	//Dado un tiempo en segundos, la computadora lo muestra expresado en días, horas, minutos y segundos.
		ps.println("Ingrese cantidad de tiempo en segundos: ");
		
		String datoLeido = entradaDeDatos(); 
		double segundos = Double.parseDouble(datoLeido);
		
		double segundosEnUnDia = 86400;
		double segundosEnUnaHora = 3600;
		double segundosEnUnMinuto = 60;
		
		double dias = segundos / segundosEnUnDia;
		double horas = segundos / segundosEnUnaHora;
		double minutos = segundos / segundosEnUnMinuto;
		
		return( "En " + segundos + " segundos hay: \n" + "\n" + "Dias: " + dias + "\n" + "Horas: " + horas + "\n" + "Minutos: " + minutos + "\n");
	}
	
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	static String ejercicioF() {
		//Dado el precio de un artículo, la computadora muestra los valores a pagar según cada plan. Una casa de artículos para el hogar ofrece a sus clientes los siguientes planes de pago:
		//Plan 1: 100% al contado. Se hace el 10% de descuento sobre el precio publicado.
		//Plan 2: 50% al contado y el resto en 2 cuotas iguales. El precio publicado se incrementa en un 10%.
		//Plan 3: 25% al contado y el resto en 5 cuotas iguales. El precio publicado se incrementa en un 15%.
		//Plan 4: Totalmente financiado en 8 cuotas. El 60% se reparte en partes iguales en las primeras 4 cuotas y el resto se reparte en partes iguales en las últimas 4 cuotas. El precio publicado se incrementa en un 25%.

		ps.println("Ingrese precio del articulo: ");
		
		String datoLeido = entradaDeDatos(); 
		double precio = Double.parseDouble(datoLeido);
		
		double precioFinalPlan1 = precio - (precio * 0.10);
		double precioFinalPlan2 = precio + (precio * 0.10);
		double precioFinalPlan3 = precio + (precio * 0.15);
		double precioFinalPlan4 = precio + (precio * 0.25);
		
		
		return( "Con el plan 1 el precio final queda en " + precioFinalPlan1 + "\n" + "Con el plan 2 el precio final queda en " + precioFinalPlan2 + "\n" + "Con el plan 3 el precio final queda en " + precioFinalPlan3 + "\n" + "Con el plan 4 el precio final queda en " + precioFinalPlan4);
	}
	
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	
	static String ejercicioG() { //Dado el signo zodiacal del usuario, la computadora muestra su mes de nacimiento aproximado.

		ps.println("Ingrese signo zodiacal: ");
		
		String signo = entradaDeDatos(); 
		
		if (signo.equals("capricornio")) {
	        return "Naciste entre el 22 de diciembre al 19 de enero";
	    } else if (signo.equals("acuario")) {
	        return "Naciste entre el 20 de enero al 18 de febrero";
	    } else if (signo.equals("piscis")) {
	        return "Naciste entre el 19 de febrero al 20 de marzo";
	    } else if (signo.equals("aries")) {
	        return "Naciste entre el 21 de marzo al 19 de abril";
	    } else if (signo.equals("tauro")) {
	        return "Naciste entre el 20 de abril al 20 de mayo";
	    } else if (signo.equals("geminis")) {
	        return "Naciste entre el 21 de mayo al 20 de junio";
	    } else if (signo.equals("cancer")) {
	        return "Naciste entre el 21 de junio al 22 de julio";
	    } else if (signo.equals("leo")) {
	        return "Naciste entre el 23 de julio al 22 de agosto";
	    } else if (signo.equals("virgo")) {
	        return "Naciste entre el 23 de agosto al 22 de septiembre";
	    } else if (signo.equals("libra")) {
	        return "Naciste entre el 23 de septiembre al 22 de octubre";
	    } else if (signo.equals("escorpio")) {
	        return "Naciste entre el 23 de octubre al 21 de noviembre";
	    } else if (signo.equals("sagitario")) {
	        return "Naciste entre el 22 de noviembre al 21 de diciembre";
	    } else {
	        return "Signo zodiacal no reconocido";
	    }
	}
	
// --------------------------------------------------------------------------------PUNTO 2----------------------------------------------------------------------------------------------------------

	static ArrayList ejercicioA2() { //Dados tres apellidos, la computadora los muestra ordenados alfabéticamente.
		ps.println("Ingrese primer apellido");
		String primerApellido = reader.leer();
		
		ps.println("Ingrese segundo apellido");
		String segundoApellido = reader.leer();
		
		ps.println("Ingrese tercer apellido");
		String tercerApellido = reader.leer();
		
		ArrayList apellidos = new ArrayList<>();
		apellidos.add(primerApellido);
		apellidos.add(segundoApellido);
		apellidos.add(tercerApellido);
		
		ArrayList ordenados = new ArrayList<>();
		Collections.sort(apellidos);	
		
		return apellidos;
	}
	
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	static ArrayList ejercicioB2() { //Dados cuatro números reales, la computadora indica cuál es el menor.
		ps.println("Ingrese primer numero");
		
		String dato1 = reader.leer();
		int num1 = Integer.parseInt(dato1);
		
		ps.println("Ingrese segundo numero");
		
		String dato2 = reader.leer();
		int num2 = Integer.parseInt(dato2);
		
		
		ps.println("Ingrese tercer numero");
		
		String dato3 = reader.leer();
		int num3 = Integer.parseInt(dato3);

		ps.println("Ingrese cuarto numero");
		
		String dato4 = reader.leer();
		int num4 = Integer.parseInt(dato4);
		
		ArrayList numeros = new ArrayList<>();
	
		numeros.add(num1);
		numeros.add(num2);
		numeros.add(num3);
		numeros.add(num4);
		
		Collections.sort(numeros);
		ps.print(numeros.get(0));
		
		return numeros;
	}
	
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	
	static String ejercicioC2(){ //Dado un número, la computadora indica si es par o impar.
		ps.println("Ingrese numero");
		
		String dato = reader.leer();
		int num = Integer.parseInt(dato);
		
		if (num % 2 == 0) {
			return "Es par";
		}
		else {
			return "es impar";
		}
		
	}

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	static String ejercicioD2(){ //Dados dos números reales, la computadora indica si el mayor es divisible por el menor.
		ps.println("Ingrese primer numero");
		
		String dato1 = reader.leer();
		int num1 = Integer.parseInt(dato1);
		
		ps.println("Ingrese segundo numero");
		
		String dato2 = reader.leer();
		int num2 = Integer.parseInt(dato2);	
		
		if (num1 > num2) {
			if (num1 % num2 == 0) {
				return (num1 + " Es divisible por " + num2);
			}
		}
		else if (num2 > num1) {
			if (num2 % num1 == 0) {
				return (num2 + " Es divisible por " + num1);
			}
		}
		else {
			return "Son iguales";
		}
		return "Los números no son divisibles entre sí";
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	static String ejercicioE2() { //Dada la fecha de nacimiento de una persona, la computadora muestra su signo del zodíaco
		ps.println("Ingrese su fecha de nacimiento");
		ps.println("Ingrese año: ");
		
		String dato1 = reader.leer();
		int año = Integer.parseInt(dato1);
		
		ps.println("Ingrese mes: ");
		
		String dato2 = reader.leer();
		int mes = Integer.parseInt(dato2);
		
		ps.println("Ingrese día: ");
		
		String dato3 = reader.leer();
		int dia = Integer.parseInt(dato3);
		
		LocalDate fecha = LocalDate.of(año, mes, dia);
		ps.println("Su fecha es: " + fecha);
		
		if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Tu signo es Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            return "Tu signo es Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Tu signo es Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tu signo es Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Tu signo es Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Tu signo es Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Tu signo es Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Tu signo es Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Tu signo es Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Tu signo es Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Tu signo es Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Tu signo es Capricornio";
        }
        return "Fecha inválida";
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	static String ejercicioF2() { // Dado el nombre y apellido de 2 personas, la computadora muestra cuál de los 2 tiene el apellido más largo.
		
		ps.println("Ingrese el nombre de la primera persona: ");
		String nombre1 = reader.leer();
		
		ps.println("Apellido: ");
		String apellido1 = reader.leer();
		
		int longitudApellido1 = apellido1.length();
		
		ps.println("Ingrese el nombre de la segunda persona: ");
		String nombre2 = reader.leer();
		
		ps.println("Apellido: ");
		String apellido2 = reader.leer();
		
		int longitudApellido2 = apellido2.length();

		if (longitudApellido1 > longitudApellido2)
			return apellido1 + " es mas largo que " + apellido2 + " por una diferencia de " + (longitudApellido1 - longitudApellido2) + " letras";
		else if(longitudApellido1 < longitudApellido2){
			return apellido2 + " es mas largo que " + apellido1 + " por una diferencia de " + (longitudApellido2 - longitudApellido1) + " letras";
		}
		else
			return apellido1 + apellido2 + "tienen la misma cantidad de caracteres con un total de" + apellido1.length() + "cada uno";
		
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	static void ejercicioG2() { // Dado un entero N natural, la computadora muestra su tabla de multiplicar.
        ps.println("Ingrese numero para realizar su tabla de multiplicar: ");
        
        String dato = reader.leer();
        int numero = Integer.parseInt(dato);
        
        for(int i = 0; i <= 10; i++) {
        	ps.println(numero + " x " + i + " = " + (numero * i));
        }
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    static void ejercicioH2() { //Dado un número natural, la computadora indica si es primo o no.
        ps.println("Ingrese un número natural para verificar si es primo: ");
            
        String dato = reader.leer();
        int numero = Integer.parseInt(dato);
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            ps.println("El número " + numero + " es primo.");
        } else {
            ps.println("El número " + numero + " no es primo.");
        }
            
    	
    	}
   }
	
	




