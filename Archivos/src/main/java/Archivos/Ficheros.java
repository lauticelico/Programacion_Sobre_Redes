package Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ficheros {
	
	private File archivo;
	private PrintStream ps;
	
	public Ficheros() {
		String ruta = ""; // " c:\\User\\ "
		String nombre = "mario";
		String extension = ".txt";
		
		archivo = new File(ruta.concat(nombre.concat(extension)));
	}
	
	public void createFilePrintStream(File a){
		FileOutputStream fos = null;
		ps = new PrintStream(fos);
		
		try {	
			fos = new FileOutputStream(a);
			ps = new PrintStream(fos, true);
			
			ps.println("ME TENES QUE ESTAR JODIENDO");
			ps.println("VAS A OCACIONAR UNA CRISIS");
			
			ps.flush();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
	
		}
		
		
	}
	
}
