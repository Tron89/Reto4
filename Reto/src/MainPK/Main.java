package MainPK;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import ClasesPK.Cliente;
import ClasesPK.Empleado;
import ClasesPK.Producto;
import ClasesPK.Tienda;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		//20 empleados,datos aleatorios, y antigüedad entre 1 y 20 años
		List<Empleado> listaEmp=new ArrayList<Empleado>();
		Empleado e =null;
		Random r=new Random();
		for (int i = 1; i <=20; i++) {
			e=new Empleado("Empleado"+i,r.nextInt(1,21));
			listaEmp.add(e);
			System.out.println(e);
		}
		System.out.println(" ");
		
		//5 tiendas con datos aleatorios, el identificador que no se repita, y asignarle un empleado que cojáis de la lista de empleados. El empleado puede ser generte en dos tiendas o más, no hay que validarlo. Llamar al método reponer de la tienda para añadir entre 5 a 10 productos. 
		List<Tienda> listaTienda=new ArrayList<Tienda>();
		List<Producto> listaProducto=null;
		List listaId=new ArrayList();
		
		Tienda t=null;
		Producto p=new Producto();
		System.out.println("Tiendas:");
		int rand=0;
		for (int i = 1; i <=5; i++) {
			listaProducto=new ArrayList<Producto>();
			do {
				rand=r.nextInt(1,6);
				if (!(listaId.contains(rand))) {
					listaId.add(rand);	
					t=new Tienda(rand,"tienda"+i,e,listaProducto);
					t.reponer(5);
					listaTienda.add(t);
					break;
				}
			} while (true);
			
			System.out.println(t);
		}
		System.out.println(" ");
		//1 cliente con datos aleatorios
		Cliente c=new Cliente("Cliente");
		
		/*
		System.out.println("Cliente:");
		System.out.println(c.getNombre());*/
		
		System.out.println(" ");
		//menu
		int menu=0;
		do {
			menu();
			menu=Util.Funciones.dimeEntero("Elige menu", sc);
			menu2(menu,listaTienda,c,sc);
			
		} while (menu!=5);
		
		
		
		sc.close();
	}
	public static void menu() {
		System.out.println("1. Ver tiendas");
		System.out.println("2. Comprar");
		System.out.println("3. Mostrar Compras");
		System.out.println("4. Realizar una queja");
		System.out.println("5. Salir");
	}
	public static void menu2(int menu,List<Tienda> listaTienda,Cliente cliente,Scanner sc) {
		switch (menu) {
		case 1:
			for (Tienda t : listaTienda) {
				System.out.println(t);
			}
			System.out.println(" ");
			break;
		case 2:
			cliente.comprarProducto(listaTienda.get(1), listaTienda.get(1).getListaProductos().get(1));
			break;
		case 3:
			System.out.println(cliente.getListaCompra());
			break;
		case 4:
			int n=0;
			
				do {
					for (Tienda t : listaTienda) {
						
					}
					n=Util.Funciones.dimeEntero("Escribe id", sc);
					if(n==t.getId()) {
						System.out.println("encontrado");
					}
				} while (n>0);
			
			
			
			
			
			break;
		case 5:
			break;
		}
	}
}
