package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	// ATRIBUTOS
	private String nombre;
	private int numeroVentas = 0;
	public static ArrayList<Pais> paises = new ArrayList<>();

	// CONSTRUCTOR
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	// MÉTODOS
	public static Pais paisMasVendedor() {
		
		int mayor        = paises.get(0).numeroVentas;
		Pais maxVendedor = paises.get(0);
		
		for (Pais pais: paises) {
			
			if (pais.getNumeroVentas() > mayor) {
				mayor = pais.getNumeroVentas();
				maxVendedor = pais;
			}
		}
		
		return maxVendedor;
	}

	// GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}	
}
