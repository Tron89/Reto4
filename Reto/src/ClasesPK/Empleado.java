package ClasesPK;

public class Empleado {
	private String nombre;
	private int antiguedad;
	private double sueldo;
	
	
	public Empleado() {
		super();
	}

	public Empleado(String nombre, int antiguedad) {
		super();
		this.nombre = nombre;
		setAntiguedad(antiguedad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
		if (antiguedad<5) {
			sueldo = 1000;
		} else if (antiguedad <= 10) {
			sueldo = 1200;
		} else {
			sueldo = 1500;
		}
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", antiguedad=" + antiguedad + ", sueldo=" + sueldo + "]";
	}
	
	
	
}
