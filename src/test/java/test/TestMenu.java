package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Factory.FactoryDAO;
import clasesDAO.ComidaDAO;
import clasesDAO.MenuDAO;
import clasesNormales.Menu;

class TestMenu {

	MenuDAO funcionesMenu;
	Menu menu1;
	Menu menu2;
	Menu menu3;
	Menu menu4;
	
	@BeforeEach
	void setUp() {
		funcionesMenu = FactoryDAO.getMenuDAO();
		menu1 = new Menu("Menú 1","papas fritas", "Hamburguesa con queso", "Banana", "Gaseosa", "NO VEGETARIANO", 3500);
		menu2 = new Menu("Menú 2","papas fritas", "Pancho", "Naranja", "Gaseosa", "NO VEGETARIANO", 3500);
		menu3 = new Menu("Menú 3","Wrap de vegetales", "Tarta de espinaca", "Manzana", "Gaseosa", "VEGETARIANO", 3500);
		menu4 = new Menu("Menú 4","batatas fritas", "Tortilla española", "Pera", "Agua", "VEGETARIANO", 3500);
		
	}

	@Test
	void agregarUnMenu() {
		Assertions.assertEquals(true, funcionesMenu.agregarMenu(menu1));
		
	}
	
	@Test
	void obtenerUnMenu() {
		funcionesMenu.agregarMenu(menu2);
		//System.out.println("Comparando id "+nuevaComida2.getId()+" CON "+funcionesComida.obtenerComidaPorId(nuevaComida2.getId()).getId());
		Assertions.assertEquals(menu2.getId(), funcionesMenu.encontrarMenuPorId(menu2.getId()).getId());
	}
	
	@Test
	void actualizarUnMenu() {
		funcionesMenu.agregarMenu(menu3);
		menu3.setEntrada("NUGGETS DE ACELGA");
		menu3.setNombreMenu("Menu 3 modificado");
		menu3.setPlatoPrincipal("TARTA DE BERENJENA");
		Assertions.assertEquals(true, funcionesMenu.actualizarMenu(menu3));
	}
	
	@Test
	void eliminarUnMenu() {
		funcionesMenu.agregarMenu(menu3);
		Assertions.assertEquals(true, funcionesMenu.eliminarMenu(menu4));
	}
}
