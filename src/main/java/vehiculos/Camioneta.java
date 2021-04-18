package vehiculos;

public class Camioneta extends Vehiculo{
	
	// ATRIBUTOS
	boolean volco;
	public static int camionetasCreadas = 0;

	// CONSTRUCTOR
	public Camioneta(
			String placa, 
			int puertas, String nombre, 
			int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		
		camionetasCreadas ++;
		
		fabricante.getPais().setNumeroVentas(fabricante.getPais().getNumeroVentas() + 1);
		fabricante.setNumVentas(fabricante.getNumVentas() + 1);
	}
	
	// GETTERS Y SETTERS
	public boolean isVolco() {
		return volco;
	}
	
	public void setVolco(boolean valor) {
		volco = valor;
	}

}
