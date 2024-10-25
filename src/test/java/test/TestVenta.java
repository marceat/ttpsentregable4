package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Factory.FactoryDAO;

import clasesDAO.VentaDAO;
import clasesNormales.Comida;

import clasesNormales.UsuarioGeneral;
import clasesNormales.Venta;

class TestVenta {

	Venta venta1;
	Venta venta2;
	Venta venta3;
	UsuarioGeneral usuario;
	Comida c;
	VentaDAO funcionesVentas;
	
	
	
	@BeforeEach
	void setUp() {
		usuario= new UsuarioGeneral(23435543,"Dario","Bazi","Dario123@gmail.com","12345"," "," ");
		c= new Comida("ensalada Cesar",3243,100); 
		venta1= new Venta(new Date(23/05/2024),5021.33," ",usuario,null,null);
		venta2= new Venta(new Date(13/12/2023),6021.33," ",usuario,null,null);
		funcionesVentas=FactoryDAO.getVentaDAO();
		venta3= new Venta(new Date(05/06/2018),1021.33," ",usuario,null,null);
	}

	@Test
	void agregarVenta() {
		Assertions.assertEquals(true, funcionesVentas.agregarVenta(venta1));
	}
	
	@Test
	void actualizarVenta() {
		funcionesVentas.agregarVenta(venta2);
		venta2.setPrecioTotal(2132.22);
		Assertions.assertEquals(true, funcionesVentas.actualizarVenta(venta2));
		
	}

	@Test
	void eliminarVenta() {
		funcionesVentas.agregarVenta(venta3);
		Assertions.assertEquals(true, funcionesVentas.eliminarVenta(venta3));
	}
}
	
