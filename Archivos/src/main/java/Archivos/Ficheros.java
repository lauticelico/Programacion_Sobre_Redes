package Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Ficheros {
	
	private File archivo;
	private PrintStream ps;
	
	public Ficheros() {
		String ruta = ""; // " c:\\User\\ "
		String nombre = "Mario";
		String extension = ".txt";
		
		archivo = new File(ruta.concat(nombre.concat(extension)));
	}
	
	public File getArchivo() {
		return this.archivo;
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
		}finally {
			if(fos != null)

				try {

				fos.close();
				
				} catch (IOException e) {

				e.printStackTrace();
		}
		
		
	}
	
}
	
	public void createFilePrinter(File a) {
		FileWriter fw = null;
		PrintWriter pw = null;
		
		
		try {
			if( !a.exists()) {
				a.createNewFile();
			}
			
			fw = new FileWriter( a , true);
			pw = new PrintWriter(fw);
			
			pw.println("Otro MUNDO");		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if( pw != null)
					pw.close();
				
				if( fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	
}

