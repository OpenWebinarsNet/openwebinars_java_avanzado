import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		 
		Map<Integer,Cliente> mapaClientes = new HashMap<Integer, Cliente>();
		
		Cliente c1 = new Cliente("Ana","88776655E","955442299");
		Cliente c2 = new Cliente("María","45776655E","955442266");
		Cliente c3 = new Cliente("Manuel","78776655E","955442254");
		Cliente c4 = new Cliente("Antonio","3242424G","955442254");
		
		mapaClientes.put(4, c1);
		mapaClientes.put(256, c2);
		mapaClientes.put(33, c3);
		
		// No es posible introducirlo, puesto que existe otra CLAVE = 2
		mapaClientes.put(2, c4);
		
		System.out.print("Mapa clientes: "+mapaClientes);
		
		Set<Integer> conjuntoClaves = mapaClientes.keySet();
		Iterator<Integer> it = conjuntoClaves.iterator();
		
		while(it.hasNext()) {
			Integer clave = it.next();
			System.out.println("Clave: "+clave);
		}
		
		System.out.println("¿Existe la clave 255? "+mapaClientes.containsKey(255));		
		
	}

}
