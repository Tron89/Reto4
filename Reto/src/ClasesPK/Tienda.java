package ClasesPK;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;




public class Tienda {
	private int id;
	private String nombre;
	private Empleado empleado;
	private List<Producto> listaProductos;
	public Tienda() {
		
	}
	public Tienda(int id, String nombre, Empleado empleado, List<Producto> listaProductos) {
		
		this.id = id;
		this.nombre = nombre;
		this.empleado = empleado;
		this.listaProductos = listaProductos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public void reponer(int num){
		Random rnd = new Random();
		//List<Integer> lista2 = new ArrayList<>();

		int code;
		boolean esta=true;
		for (int i=0;i< num;i++) {
			do {
				code = rnd.nextInt(10, 100);
				for (Producto prod : listaProductos) {
				if (prod.getId()==code) {esta=false;break;} 
				}
				if (esta==true) {break;}
			} while (true);
			//lista2.add(code);
			Producto p = new Producto(code, "producto " + code, Util.Funciones.redondea(rnd.nextDouble(1, 100)));
			
			listaProductos.add(p);
		}
	}
	public void vender(int codigo){
			boolean esta=false;
			for (Producto prod : listaProductos) {
				if (prod.getId() == codigo) {
					listaProductos.remove(prod);
					esta=true;
				
				}
			}
		
				if (esta=false) {System.out.println("Ese codigo no existe");}
				if (listaProductos.size()<5) {reponer(5);}
		
	}
	@Override
	public String toString() {
		return "Tienda [id=" + id + ", nombre=" + nombre + ", empleado=" + empleado + ", listaProductos="
				+ listaProductos + "]";

	}
	

	}
	
	
	


