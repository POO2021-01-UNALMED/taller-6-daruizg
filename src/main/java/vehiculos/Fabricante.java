package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	// ATRIBUTOS
	private String nombre;
	private Pais pais;
	private int numVentas = 0;
	public static ArrayList<Fabricante> fabricas = new ArrayList<>();
	
	// CONSTRUCTOR
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricas.add(this);
	}
	
	// MÉTODOS
	public static Fabricante fabricaMayorVentas() {
		
		int mayorVenta 			   = fabricas.get(0).numVentas;
		Fabricante mayorFabricante = fabricas.get(0);
		
		for (Fabricante fabricante: fabricas) {
			
			if (fabricante.numVentas > mayorVenta) {
				mayorFabricante = fabricante;
			}
		}
		
		return mayorFabricante;
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

	public int getNumVentas() {
		return numVentas;
	}

	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}
}
