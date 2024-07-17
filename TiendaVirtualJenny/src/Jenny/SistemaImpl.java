package Jenny;

import java.util.ArrayList;

public class SistemaImpl implements Sistema
{
	private static Sistema instance;
	private ArrayList<Ropa> listaObjetosProductos;
	
	public SistemaImpl(ArrayList<String> listaProductos)
	{
		listaObjetosProductos = new ArrayList<>();
		
		for(String s: listaProductos)
		{
			String[] partes = s.split(",");
			String prenda = partes[0];
			String marca = partes[1];
			int precio = Integer.valueOf(partes[2]);
			String colores = partes[3];
			String tallas = partes[4];
			
			switch(prenda.toLowerCase())
			{
				case "polera":
					
					Ropa polera = new Polera(marca,precio,colores,tallas);
					listaObjetosProductos.add(polera);
					break;
					
				case "zapatilla":
					Ropa zapatilla = new Zapatilla(marca,precio,colores,tallas);
					listaObjetosProductos.add(zapatilla);
					break;
					
				case "chaqueta":
					Ropa chaqueta = new Chaqueta(marca,precio,colores,tallas);
					listaObjetosProductos.add(chaqueta);
					break;
					
				case "jeans":
					Ropa jeans = new Jeans(marca,precio,colores,tallas);
					listaObjetosProductos.add(jeans);
					break;
			}
		}
	}
	
	public static Sistema getInstance(ArrayList<String> listaProductos)
	{
		if(instance == null)
		{
			instance = new SistemaImpl(listaProductos);
		}
		return instance;
	}

	@Override
	public String toStringProductos() {
		String mensaje = "";
		mensaje += "Productos de La tienda: "+ "\n";
		for(Ropa r: listaObjetosProductos)
		{
			
			mensaje += r.getTipo() + " "+ "'"+r.getMarca()+"'" +"\n";
			mensaje += "Precio: "+r.getPrecio()+"\n";
			mensaje += "Colores: "+ r.getColores() +"\n";
			mensaje += "Tallas: " + r.getTallas()+"\n";
			mensaje += "\n";
		}
		
		return mensaje;
	}
	
	
}
