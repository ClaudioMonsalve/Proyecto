package Jenny;

public class Zapatilla extends Ropa {

	public Zapatilla(String marca, int precio, String colores, String tallas) {
		super(marca, precio, colores, tallas);
		
	}

	public String getTipo()
	{
		return "Zapatilla";
	}
}
