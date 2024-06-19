package Archivos;

import java.io.BufferedReader;
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
	
	public Ficheros(String rut, String name, String ext) {
		String ruta = rut; // " c:\\User\\ "
		String nombre = name;
		String extension = ext; 
		
		archivo = new File(ruta.concat(nombre.concat(extension)));
		try {

			System.setErr(new PrintStream(new FileOutputStream(new File("Errores.log")),true));

		} catch (IOException e) {

			Logger.getLogger(Ficheros.class.getName()).log(Level.WARNING, null, e);

		}

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

	public void createFileBuffered(File a) {

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
	
	public String leerCharChar(File a) {

		// como leo un archivo?
		FileReader fr = null;
		String texto = "";
		try {

			fr = new FileReader(a);
			int letra;
			while ((letra = fr.read()) != -1) // la condicion es -1
			{
				texto += (char) letra;
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return texto;

	}
	
	public String leerConReader(File a) { //Clase Reader
	    FileReader fr = null;
	    BufferedReader br = null;
	    String texto = "";

	    try {
	        fr = new FileReader(a);
	        br = new BufferedReader(fr);
	        String linea = "";

	        while ((linea = br.readLine()) != null) {
	            texto += linea.concat("\n");
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (br != null) br.close();
	            if (fr != null) fr.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    return texto;
	}

	public void editarArchivo(File original) {
		File copia = new File("copia.tmp");
		FileReader Fr = null;
		BufferedReader Br = null;
		FileWriter Fw = null;
		PrintWriter Pw = null;
		
		try {
			 Fr = new FileReader(original);
			 Br = new BufferedReader(Fr);
			
			if( !copia.exists() )
			{
				 Fw = new FileWriter(copia, true);
				 Pw = new PrintWriter(Fw);
				 
				 String renglon = "";
				 while((renglon = Br.readLine( )) != null) {
					 //sobre el STRING renglon puedo trabajar
					 //mantengo los datos?
					 // elimino los datos?
					 //  edito  los datos?
					 Pw.println(renglon.toUpperCase());
				 }
				 
			}
			Br.close();
			Fr.close();
			
			if(original.exists() )
				original.delete();
			
			if(copia.exists())
				copia.renameTo(original);
			
		}catch(FileNotFoundException ex) {
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally{
			
		}
		
	}
	
	
	
	
	
	
}

