
// MENU PRINCIPAL:
// NIVEL JARDIN:
// NIVEL PRIMARIO:
// NIVEL SECUNDARIO:

// MENU JARDIN:
// BUSCAR ALUMNO POR DNI.
// VER SALITAS:
// 	*SALA CELESTE
//	*SALA VERDE
//	*SALA AZUL
//	*SALA ROJA
//		1- ADMINISTRAR ALUMNOS:
//			a- AGREGAR ALUMNO
//			b- ELIMINAR ALUMNO
//			c- BUSCAR ALUMNO
//		2- ADMINISTRAR DOCENTES:
//			a- AGREGAR DOCENTE
//			b- ELIMINAR DOCENTE
//			c- BUSCAR DOCENTE
//		3- ADMINISTRAR SALON
//			a- VER CUPOS
//			

package interfaz;
import java.util.Scanner;

import dominio.Jardin;
import dominio.MenuNiveles;
import dominio.MenuSalitas;
import dominio.Salon;
import dominio.SistemaEducativo;

public class GestionDeSistemaEducativo {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		SistemaEducativo sistemaEducativo = new SistemaEducativo();
		
		mostrarPorPantalla("\n** BIENVENIDO AL SISTEMA DE GESTION EDUCATIVO **\n");
		
		MenuNiveles opcion = null;
		
		do {
			opcion = ingresarOpcionMenuPrincipal();
			
			switch(opcion) {
				case NIVEL_JARDIN:
					ingresarOpcionMenuDeNiveles();
					sistemaEducativo.mostrarSalon();
					break;
				case NIVEL_PRIMARIO:
					break;
				case NIVEL_SECUNDARIO:
					break;
				case SALIR:
					mostrarPorPantalla("\nHasta luego!");
					break;
			}
			
		}while(!opcion.equals(MenuNiveles.SALIR));
		
	}

	private static MenuSalitas ingresarOpcionMenuDeNiveles() {
		mostrarMenuDeNiveles();
		int opcion = ingresarEntero("\nIngrese la opcion que desea: ");
		return MenuSalitas.values()[opcion-1];
	}
	
	private static void mostrarMenuDeNiveles() {
		for (int i = 0; i < MenuSalitas.values().length; i++) {
			mostrarPorPantalla(i + 1 + ") " + MenuSalitas.values()[i].getDescripcion());
		}
	}
	
	private static MenuNiveles ingresarOpcionMenuPrincipal() {
		mostrarMenuPrincipal();
		int opcion = ingresarEntero("\nIngrese la opcion que desea: ");
		return MenuNiveles.values()[opcion-1];
	}
	
	private static void mostrarMenuPrincipal() {
		for (int i = 0; i < MenuNiveles.values().length; i++) {
			mostrarPorPantalla(i + 1 + ") " + MenuNiveles.values()[i].getDescripcion());
		}
	}
	
//	private static Jardin mostrarSalon() {
//		for(int i = 0; i < )
//	}
	
	private static int ingresarEntero(String mensaje) {
		mostrarPorPantalla(mensaje);
		return teclado.nextInt();
	}
	
	private static String ingresarString(String mensaje) {
		mostrarPorPantalla(mensaje);
		return teclado.next();
	}
	
	private static void mostrarPorPantalla(String mensaje) {
		System.out.println(mensaje);
	} 
	
}
