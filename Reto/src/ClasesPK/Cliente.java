package ClasesPK;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Cliente {
	private String nombre;
	private HashMap<Tienda, List<Producto>> listaCompra;
	
	public void comprarProducto(Tienda tienda, Producto producto) {
		tienda.vender(producto.getId());
		if (listaCompra.get(tienda).isEmpty()) {
			List lista = new ArrayList<Producto>();
			listaCompra.put(tienda, lista);
		} else {
			listaCompra.get(tienda).add(producto);
		}
		
	}

}
