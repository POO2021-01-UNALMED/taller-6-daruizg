package vehiculos;

public class Camion extends Vehiculo {
	
	// ATRIBUTOS
	int ejes;
	public static int camionesCreados = 0;

	// CONSTRUCTOR
	public Camion(
			String placa, 
			String nombre, int precio, 
			int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		
		camionesCreados ++;
		
		fabricante.getPais().setNumeroVentas(fabricante.getPais().getNumeroVentas() + 1);
		fabricante.setNumVentas(fabricante.getNumVentas() + 1);
	}
	
	// GETTERS Y SETTERS
	public int getEjes() {
		return ejes;
	}
	
	public void setEjes(int n) {
		ejes = n;
	}
}
