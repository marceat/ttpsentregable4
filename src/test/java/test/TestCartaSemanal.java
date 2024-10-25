package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Factory.FactoryDAO;
import clasesDAO.CartaSemanalDAO;
import clasesDAO.MenuDAO;
import clasesNormales.CartaSemanal;
import clasesNormales.Menu;

class TestCartaSemanal {
	
	CartaSemanalDAO funcionesCartaSemanal;
	CartaSemanal cartaSemanal;
	
	MenuDAO funcionesMenu;
	
	Menu menuLunes1;
	Menu menuLunes2;
	
	Menu menuMartes1;
	Menu menuMartes2;
	
	Menu menuMiercoles1;
	Menu menuMiercoles2;
	
	Menu menuJueves1;
	Menu menuJueves2;
	
	Menu menuViernes1;
	Menu menuViernes2;
	
	@BeforeEach
	void setUp() {
		funcionesCartaSemanal = FactoryDAO.getCartaSemanalDAO();
		menuLunes1 = new Menu("Menú 1","papas fritas", "Hamburguesa de carne", "Banana", "Gaseosa", "NO VEGETARIANO", 3500);
		menuLunes2 = new Menu("Menú 2","papas fritas", "Hamburguesa de soja", "Banana", "Gaseosa", "VEGETARIANO", 3500);
		
		menuMartes1 = new Menu("Menú 1","Empanada de pollo", "Porcion de pizza", "Naranja", "Gaseosa", "NO VEGETARIANO", 3500);
		menuMartes2 = new Menu("Menú 2","Empanada de verduras", "Pancho", "Naranja", "Gaseosa", "VEGETARIANO", 3500);
		
		menuMiercoles1 = new Menu("Menú 1","Wrap de pollo", "Tarta de JyQ", "Manzana", "Gaseosa", "NO VEGETARIANO", 3500);
		menuMiercoles2 = new Menu("Menú 2","Wrap de verduras", "Tarta de espinaca", "Manzana", "Gaseosa", "VEGETARIANO", 3500);
		
		menuJueves1 = new Menu("Menú 1","Empanada de carne", "Risoto con pollo", "Manzana", "Gaseosa", "NO VEGETARIANO", 3500);
		menuJueves2 = new Menu("Menú 2","Empanada de JyQ", "Fideos con bolognesa", "Manzana", "Gaseosa", "VEGETARIANO", 3500);
		
		menuViernes1 = new Menu("Menú 4","batatas fritas", "Pastel de carne", "Pera", "Agua", "NO VEGETARIANO", 3500);
		menuViernes2 = new Menu("Menú 4","batatas fritas", "Tortilla española", "Pera", "Agua", "VEGETARIANO", 3500);
		
		funcionesMenu = FactoryDAO.getMenuDAO();
		
		funcionesMenu.agregarMenu(menuLunes1);
		funcionesMenu.agregarMenu(menuLunes2);
		funcionesMenu.agregarMenu(menuMartes1);
		funcionesMenu.agregarMenu(menuMartes2);
		funcionesMenu.agregarMenu(menuMiercoles1);
		funcionesMenu.agregarMenu(menuMiercoles2);
		funcionesMenu.agregarMenu(menuJueves1);
		funcionesMenu.agregarMenu(menuJueves2);
		funcionesMenu.agregarMenu(menuViernes1);
		funcionesMenu.agregarMenu(menuViernes2);
		
		//ArrayList<Menu> menusDelLunes = new ArrayList<Menu>();
		//ArrayList<Menu> menusDelMartes  = new ArrayList<Menu>();
		//ArrayList<Menu> menusDelMiercoles = new ArrayList<Menu>();
		//ArrayList<Menu> menusDelJueves = new ArrayList<Menu>();
		//ArrayList<Menu> menusDelViernes = new ArrayList<Menu>();
		
		//menusDelLunes.add(menuLunes1);
		//menusDelLunes.add(menuLunes2);
		
		//menusDelMartes.add(menuMartes1);
		//menusDelMartes.add(menuMartes2);
		
		//menusDelMiercoles.add(menuMiercoles1);
		//menusDelMiercoles.add(menuMiercoles2);
		
		//menusDelJueves.add(menuJueves1);
		//menusDelJueves.add(menuJueves2);
		
		//menusDelViernes.add(menuViernes1);
		//menusDelViernes.add(menuViernes2);
		
		cartaSemanal = new CartaSemanal (menuLunes1.getId(),menuLunes2.getId(),menuMartes1.getId(),
				menuMartes2.getId(),menuMiercoles1.getId(),menuMiercoles2.getId(),menuJueves1.getId(),menuJueves2.getId(),
				menuViernes1.getId(),menuViernes2.getId());
				
	}

	@Test
	void agregarUnaCartaSemanal() {
		Assertions.assertEquals(true, funcionesCartaSemanal.agregarCartaSemanal(cartaSemanal));		
	}

}
