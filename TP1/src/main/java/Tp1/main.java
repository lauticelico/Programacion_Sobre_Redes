package Tp1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);

        int[] vector1 = new int[5];
        int[] vector2 = {10, 2, 3, 4, 3};
         

        try {
            for (int i = 0; i < 5; i++) {
                ps.println("Ingrese numero "+ (i+1) +" del primer vector");
                vector1[i] = Integer.parseInt(br.readLine());
            }

      
        } catch (IOException e) {
            ps.println("Se produjo un error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            ps.println("Debe ingresar un número válido: " + e.getMessage());
        }

// -----------------------------------------------ARCHIVO DE TEXTO-----------------------------------------------------------
        String fileName = "nonVolatileMemory.txt";

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (int i = 0; i < vector1.length; i++) {
                fileWriter.write(vector1[i] + "\n");
            }
            for (int i = 0; i < vector2.length; i++) {
                fileWriter.write(vector2[i] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

 // ----------------------------------------ARCHIVO DE RESULTADOS Y ERRORES-----------------------------------------------------------
        String archivoResultados = "resultados.txt";
        String archivoErrores = "error.txt";

        try (FileWriter resultadosWriter = new FileWriter(archivoResultados);
             FileWriter erroresWriter = new FileWriter(archivoErrores)) {

// ----------------------------------------PRIMER VECTOR-----------------------------------------------------------
            for (int i = 0; i < vector1.length - 1; i++) {
                int numero1 = vector1[i];
                int numero2 = vector1[i + 1] - 3;

                try {
                    if (numero2 == 0) {
                        throw new ArithmeticException("División por cero");
                    }
                    double resultado = (double) numero1 / numero2;
                    resultadosWriter.write(numero1 + " / " + numero2 + " = " + resultado + "\n");
                } catch (ArithmeticException e) {
                    erroresWriter.write(numero1 + " / " + numero2 + " = error (" + e.getMessage() + ")\n");
                }
            }

// ----------------------------------------SEGUNDO VECTOR-----------------------------------------------------------

            for (int i = 0; i < vector2.length - 1; i++) {
                int numero1 = vector2[i];
                int numero2 = vector2[i + 1] - 3;

                try {
                    if (numero2 == 0) {
                        throw new ArithmeticException("División por cero");
                    }
                    double resultado = (double) numero1 / numero2;
                    resultadosWriter.write(numero1 + " / " + numero2 + " = " + resultado + "\n");
                } catch (ArithmeticException e) {
                    erroresWriter.write(numero1 + " / " + numero2 + " = error (" + e.getMessage() + ")\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
