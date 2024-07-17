package Jenny;

public class Jeans extends Ropa {

	public Jeans(String marca, int precio, String colores, String tallas) {
		super(marca, precio, colores, tallas);
		
	}

	public String getTipo()
	{
		return "Jeans";
	}
}
