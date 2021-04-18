package vehiculos;

public class Vehiculo {
	
	// ATRIBUTOS
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	
	public static int cantidadVehiculos = 0;
	
	// CONSTRUCTOR
	public Vehiculo(
			String placa, 
			int puertas, int velocidadMaxima, 
			String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		
		cantidadVehiculos ++;
	}
	
	// MÉTODOS
	public static void setCantidadVehiculos(int c) {
		cantidadVehiculos = c;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public String vehiculosPorTipo() {
		return 
				"Automoviles: " + Automovil.automovilesCreados
				+ "Camionetas: " + Camioneta.camionetasCreadas
				+ "Camiones: " + Camion.camionesCreados;
	}

	// GETTERS Y SETTERS
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
