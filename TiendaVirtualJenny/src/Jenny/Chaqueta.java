package Jenny;

public class Chaqueta extends Ropa
{

	public Chaqueta(String marca, int precio, String colores, String tallas) {
		super(marca, precio, colores, tallas);
		
	}
	
	public String getTipo()
	{
		return "Chaqueta";
	}
}
