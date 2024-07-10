package examen_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datos {

	public static void mostrar() {
		FileReader fr = null;
		BufferedReader br = null;
		PrintStream ps;
		
//No me anda ya que necesito la otra parte del archivo
		try {
			fr = new FileReader(copia);
			br = new BufferedReader(fr);
			String aux;
			
			ps.println("Datos del archivo: ");

			while ((aux = br.readLine()) != null) {
				String[] datos = aux.split(";");
				ps.printf(Utils.ANSI_GREEN + "%-20s\t" + Utils.ANSI_PURPLE + "%-20s\t" + Utils.ANSI_BLUE_BRIGHT + "%-15s\t " + Utils.ANSI_RED_BRIGHT + "%-5s\n",datos[0], datos[1], datos[2], datos[3]);

			}

		} catch (FileNotFoundException e) {
			Logger.getLogger(Datos.class.getName()).log(Level.WARNING, null, e);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (br != null)
					br.close();
			} catch (IOException e) {
				Logger.getLogger(Datos.class.getName()).log(Level.WARNING, null, e);
			}
		}
	}


}
