package ClasesPK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Cliente {
	private String nombre;
	private HashMap<Tienda, List<Producto>> listaCompra;
	
	public void comprarProducto(Tienda tienda, Producto producto) {
		tienda.vender(producto.getId());
		if (listaCompra.get(tienda).isEmpty()) {
			List<Producto> lista = new ArrayList<Producto>();
			listaCompra.put(tienda, lista);
		} else {
			listaCompra.get(tienda).add(producto);
		}
	}
	public double gastoTotal() {
		double price = 0;
		for (Entry<Tienda, List<Producto>> entry : listaCompra.entrySet()) {
			for(Producto producto : entry.getValue()) {
				price += producto.getPrecio();
			}
		}
		return price;
	}
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
		this.listaCompra = new HashMap<Tienda, List<Producto>>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public HashMap<Tienda, List<Producto>> getListaCompra() {
		return listaCompra;
	}
	public void setListaCompra(HashMap<Tienda, List<Producto>> listaCompra) {
		this.listaCompra = listaCompra;
	}
	
	
	

}
