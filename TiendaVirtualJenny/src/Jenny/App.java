package Jenny;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException
	{
		CrearSistema();
	}
	
	public static void CrearSistema() throws FileNotFoundException
	{
		File arch = new File("Butterfly.txt");
		Scanner scan = new Scanner(arch);
		ArrayList<String> listaProductos = new ArrayList<>();
		
		while(scan.hasNextLine())
		{
			String linea = scan.nextLine();
			listaProductos.add(linea);
		}
		
		Sistema sistema = SistemaImpl.getInstance(listaProductos);
		String mensaje = sistema.toStringProductos();
		System.out.println("¡ Bienvenido a la Tienda Jenini !");
		System.out.println("---------------------------------------------------");
		System.out.println(" ");
		while(true)
		{
			
			System.out.println(mensaje);
			System.out.print("Hola Usuario, que prenda deseas llevar (Jeans/Chaqueta/Polera/Zapatilla): ");
			Scanner scanUsuario = new Scanner(System.in);
			
			String prenda = scanUsuario.nextLine().toLowerCase();
			
			if((prenda.equals("chaqueta"))||(prenda.equals("jeans"))||(prenda.equals("polera"))||(prenda.equals("zapatilla")))
			{
				
				
				
				
			}
			
			else
			{
				System.out.println("Lo siento, esta prenda no se encuentra en la tienda");
				
				System.out.println(" ");
			}
		}
		
		
		
		
		
	}
	
}
