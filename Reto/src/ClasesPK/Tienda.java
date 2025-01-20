package ClasesPK;

public class Tienda {
	private int id;
	private String nombre;
	private List<Empleado>empleado;
	
	public Tienda() {
		
	}
	public Tienda(int id, String nombre, List<Empleado> empleado) {
		
		this.id = id;
		this.nombre = nombre;
		this.empleado = empleado;
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
	public List<Empleado> getEmpleado() {
		return empleado;
	}
	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}
	@Override
	public String toString() {
		return "Tienda [id=" + id + ", nombre=" + nombre + "]";
	}


}
