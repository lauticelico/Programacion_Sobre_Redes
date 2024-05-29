package Archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.logging.Logger;
import java.util.logging.Level;

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
	
	public void datosArchivos() {
	try {
		ps = new PrintStream(System.out);
		ps.println("Name: " + archivo.getName());
		ps.println("Path: " + archivo.getPath());
		ps.println("PathAbs: " + archivo.getAbsolutePath());
		ps.println("PathCannon: " + archivo.getCanonicalPath());
		ps.println("Contenedor del archivo: " + archivo.getParentFile());
		ps.println("Parent: " + archivo.getParent());
		ps.println("Tamaño: " + archivo.getTotalSpace());
		
		ps.println("ejecutable?: " + archivo.canExecute());
		ps.println("Acceso de lectura: " + archivo.canRead());
		ps.println("Acceso de escritura: " + archivo.canWrite());
		ps.println("esta oculto?: " + archivo.isHidden());
		//"ELIMINA " + archivo.delete();
		//"ELIMINA cuando se cierra el programa: " + archivo.deleteOnExit());

		ps.println("existe?: " + archivo.exists());
		ps.println("es archivo?: " + archivo.isFile());
		ps.println("es carpeta?: " + archivo.isDirectory());
		//ps.println("Crea ARCHIVOS: " + archivo.createNewFile());
		//ps.println("Crea CARPETAS " + archivo.createNewFile());
		//ps.println("?: " + archivo.renameTo("NuevoNombre.txt"));

	}catch(IOException e){
		e.printStackTrace();
	}
		
		
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

	public void createFileBuffe(File a) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			fw = new FileWriter(a,true);
			bw = new BufferedWriter(fw);	
			bw.write("Hellooo");
			bw.newLine();
			bw.write("Byeee");
			bw.flush();

		} catch (IOException e) {

			Logger.getLogger(Ficheros.class.getName()).log(Level.WARNING,null,e);

		}finally {

			try {
	
				if(fw != null)
				fw.close();
		
				if(bw != null)
				bw.close();

			} catch (IOException e) {

				Logger.getLogger(Ficheros.class.getName()).log(Level.WARNING,null,e);

			}

		}

	}
	
	public void leerCharChar(File a) {
		FileReader fr = null;
		String texto = "";

		try {
			fr = new FileReader(a);
			
			int letra;
			while ( (letra = fr.read()) != 1 ){
				texto += letra;
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}
	
	
	
}

