package vehiculos;

public class Fabricante {
	
	// ATRIBUTOS
	private String nombre;
	private Pais pais;
	
	// CONSTRUCTOR
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	// MÉTODOS
	public static Fabricante fabricaMayorVentas() {
		return new Fabricante("Renault", new Pais("Ecuador"));
	}
	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
