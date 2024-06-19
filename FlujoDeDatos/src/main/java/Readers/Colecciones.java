package Readers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {

	//Colecciones son variables donde se pueden guardar mas de 1 dato a la vez
	
	//vector
	//int[] vector = new int[num];
	
	//menos eficiente para agregar
	ArrayList<String> frutas = new ArrayList<>();
	ArrayList verduras = new ArrayList<>();
	
	List nombre = new ArrayList<>();
	List<String> apellido = new ArrayList<>();
	
	//muy eficientes para agregar información
	LinkedList<String> componentesPc = new LinkedList<>();
	List precios = new LinkedList<>();
	
	LinkedHashMap<String, String> listaEspañolIngles = new LinkedHashMap<>();
	Map<Integer,Integer> valores = new LinkedHashMap<>();
	
	LinkedHashSet<Integer> listaEspañol = new LinkedHashSet<>();
	Set<Integer> valores2 = new LinkedHashSet<>();
	
	//        k   ,   v
	HashMap<String, String> españolRAE = new HashMap<>();
	Map<String,Integer> españolIngles = new HashMap();
	
	
	HashSet<String> claves = new HashSet<>();
	Set<Integer> DNI = new HashSet<>();
	
	//-----------------------------------------------
	
	public void Array()
	{
		frutas.add("s");
		verduras.add(5);
		verduras.add("s");
		
		frutas.clear(); //limpia todo lo de adentro
		frutas.remove("manzana"); //lo que esta en la posicion 5
		frutas.remove("manzana"); // busca y borra ese dato particular
		
		verduras.contains("tomate"); //existe o no
		verduras.containsAll( new ArrayList<>());
		
		frutas.get(5); //devuelve lo que esta en la posicion 5
		frutas.indexOf("banana"); //buscar banana y devuelve la posicion
	
		verduras.isEmpty();
		verduras.size();
		
		Object[] ver = verduras.toArray();
		Collection<String> valores = españolRAE.values();
	}
	
	public void Recorridos() {

		// FOR normal

		for (int i = 0; i <= frutas.size(); i++) {
			frutas.get(i);
		}
	
			// FOR EACH
	
		for (String item : frutas) {
			System.out.println(item);
		}
	
		Iterator it = frutas.iterator();
	
		while (it.hasNext()) {
			it.remove();	
			it.next();
		}
		
		///////MAP´s & SET´s
		///MAP(k,v) & SET(k)
		for(String traduccion : españolRAE.keySet()) {		
		}
		
		for(String traduccion : españolRAE.values()) {		
		} 
		
		Iterator it2 = españolRAE.keySet().iterator();
		while( it2.hasNext() )
		{
			Object key = it2.next(); //k
			españolRAE.get(key);     //v
		}
		
		for( Map.Entry<String, String> e : españolRAE.entrySet())
		{
			e.getKey();
			e.getValue();
		}
		Collections.sort( verduras , Collections.reverseOrder() );

	}
}




