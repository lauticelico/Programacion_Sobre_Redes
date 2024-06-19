package Archivos;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ficheros archivo = new Ficheros("", "Mario", ".txt");
		//archivo.createFilePrintStream(archivo.getArchivo());
		
		//archivo.createFilePrinter(archivo.getArchivo());
		//archivo.datosArchivos();
		archivo.editarArchivo(archivo.getArchivo());
	}

}
