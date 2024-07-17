package Jenny;

public abstract class Ropa 
{
	private String tallas;
	private String colores;
	private int precio;
	private String marca;

	public Ropa(String marca, int precio, String colores, String tallas) {
		this.precio = precio;
		this.colores = colores;
		this.tallas = tallas;
		this.marca = marca;
	}

	public String getTallas() {
		return tallas;
	}

	public String getColores() {
		return colores;
	}

	public int getPrecio() {
		return precio;
	}

	public String getMarca() {
		return marca;
	}
	
	abstract String getTipo();

}
