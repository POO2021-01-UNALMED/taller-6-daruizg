package vehiculos;

public class Automovil extends Vehiculo {
	
	// ATRIBUTOS
	private int puestos;
	public static int automovilesCreados = 0;
	
	// CONSTRUCTOR
	public Automovil(
			String placa, 
			String nombre, int precio, 
			int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		
		automovilesCreados ++;
		
		fabricante.getPais().setNumeroVentas(fabricante.getPais().getNumeroVentas() + 1);
	}
	
	// GETTERS Y SETTERS
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
